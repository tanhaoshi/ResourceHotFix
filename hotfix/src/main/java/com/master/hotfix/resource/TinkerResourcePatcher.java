package com.master.hotfix.resource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Log;

import com.master.hotfix.reflect.ReflectUtil;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.KITKAT;

/**
 * create by ths on 2021/3/3
 */
public class TinkerResourcePatcher {

    private static final String TAG = "Tinker.ResourcePatcher";
    private static final String TEST_ASSETS_VALUE = "only_use_to_test_tinker_resource.txt";

    // original object
    private static Collection<WeakReference<Resources>> references = null;
    private static Object currentActivityThread = null;
    private static AssetManager newAssetManager = null;

    // method
    private static Method addAssetPathMethod = null;
    private static Method addAssetPathAsSharedLibraryMethod = null;
    private static Method ensureStringBlocksMethod = null;

    // field
    private static Field assetsFiled = null;
    private static Field resourcesImplFiled = null;
    private static Field resDir = null;
    private static Field packagesFiled = null;
    private static Field resourcePackagesFiled = null;
    private static Field publicSourceDirField = null;
    private static Field stringBlocksField = null;

    @SuppressWarnings("unchecked")
    public static void isResourceCanPatch(Context context) throws Throwable {
        //   - Replace mResDir to point to the external resource file instead of the .apk. This is
        //     used as the asset path for new Resources objects.
        //   - Set Application#mLoadedApk to the found LoadedApk instance

        // Find the ActivityThread instance for the current thread
        Class<?> activityThread = Class.forName("android.app.ActivityThread");
        currentActivityThread = getActivityThread(context, activityThread);

        // API version 8 has PackageInfo, 10 has LoadedApk. 9, I don't know.
        Class<?> loadedApkClass;
        try {
            loadedApkClass = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException e) {
            loadedApkClass = Class.forName("android.app.ActivityThread$PackageInfo");
        }

        resDir = ReflectUtil.findField(loadedApkClass, "mResDir");
        packagesFiled = ReflectUtil.findField(activityThread, "mPackages");
        if (SDK_INT < 27) {
            resourcePackagesFiled = ReflectUtil.findField(activityThread, "mResourcePackages");
        }

        // Create a new AssetManager instance and point it to the resources
        final AssetManager assets = context.getAssets();
        addAssetPathMethod = ReflectUtil.findMethod(assets, "addAssetPath", String.class);
        if (shouldAddSharedLibraryAssets(context.getApplicationInfo())) {
            addAssetPathAsSharedLibraryMethod =
                    ReflectUtil.findMethod(assets, "addAssetPathAsSharedLibrary", String.class);
        }

        // Kitkat needs this method call, Lollipop doesn't. However, it doesn't seem to cause any harm
        // in L, so we do it unconditionally.
        try {
            stringBlocksField = ReflectUtil.findField(assets, "mStringBlocks");
            ensureStringBlocksMethod = ReflectUtil.findMethod(assets, "ensureStringBlocks");
        } catch (Throwable ignored) {
            // Ignored.
        }

        // Use class fetched from instance to avoid some ROMs that use customized AssetManager
        // class. (e.g. Baidu OS)
        newAssetManager = (AssetManager) ReflectUtil.findConstructor(assets).newInstance();

        // Iterate over all known Resources objects
        if (SDK_INT >= KITKAT) {
            //pre-N
            // Find the singleton instance of ResourcesManager
            final Class<?> resourcesManagerClass = Class.forName("android.app.ResourcesManager");
            final Method mGetInstance = ReflectUtil.findMethod(resourcesManagerClass, "getInstance");
            final Object resourcesManager = mGetInstance.invoke(null);
            try {
                Field fMActiveResources = ReflectUtil.findField(resourcesManagerClass, "mActiveResources");
                final ArrayMap<?, WeakReference<Resources>> activeResources19 =
                        (ArrayMap<?, WeakReference<Resources>>) fMActiveResources.get(resourcesManager);
                references = activeResources19.values();
            } catch (NoSuchFieldException ignore) {
                // N moved the resources to mResourceReferences
                final Field mResourceReferences = ReflectUtil.findField(resourcesManagerClass, "mResourceReferences");
                references = (Collection<WeakReference<Resources>>) mResourceReferences.get(resourcesManager);
            }
        } else {
            final Field fMActiveResources = ReflectUtil.findField(activityThread, "mActiveResources");
            final HashMap<?, WeakReference<Resources>> activeResources7 =
                    (HashMap<?, WeakReference<Resources>>) fMActiveResources.get(currentActivityThread);
            references = activeResources7.values();
        }
        // check resource
        if (references == null) {
            throw new IllegalStateException("resource references is null");
        }

        final Resources resources = context.getResources();

        // fix jianGuo pro has private field 'mAssets' with Resource
        // try use mResourcesImpl first
        if (SDK_INT >= 24) {
            try {
                // N moved the mAssets inside an mResourcesImpl field
                resourcesImplFiled = ReflectUtil.findField(resources, "mResourcesImpl");
            } catch (Throwable ignore) {
                // for safety
                assetsFiled = ReflectUtil.findField(resources, "mAssets");
            }
        } else {
            assetsFiled = ReflectUtil.findField(resources, "mAssets");
        }

        try {
            publicSourceDirField = ReflectUtil.findField(ApplicationInfo.class, "publicSourceDir");
        } catch (NoSuchFieldException ignore) {
            // Ignored.
        }
    }

    /**
     * @param context
     * @param externalResourceFile
     * @throws Throwable
     */
    public static void monkeyPatchExistingResources(Context context, String externalResourceFile) throws Throwable {
        if (externalResourceFile == null) {
            return;
        }

        final ApplicationInfo appInfo = context.getApplicationInfo();

        final Field[] packagesFields;
        Class<?> activityThread = Class.forName("android.app.ActivityThread");
        currentActivityThread = getActivityThread(context, activityThread);
        packagesFiled = ReflectUtil.findField(activityThread, "mPackages");
        Class<?> loadedApkClass;
        try {
            loadedApkClass = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException e) {
            loadedApkClass = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        resDir = ReflectUtil.findField(loadedApkClass, "mResDir");
        if (SDK_INT < 27) {
            resourcePackagesFiled = ReflectUtil.findField(activityThread, "mResourcePackages");
            packagesFields = new Field[]{packagesFiled, resourcePackagesFiled};
        } else {
            packagesFields = new Field[]{packagesFiled};
        }
        for (Field field : packagesFields) {
            final Object value = field.get(currentActivityThread);

            for (Map.Entry<String, WeakReference<?>> entry
                    : ((Map<String, WeakReference<?>>) value).entrySet()) {
                final Object loadedApk = entry.getValue().get();
                if (loadedApk == null) {
                    continue;
                }
                final String resDirPath = (String) resDir.get(loadedApk);
                if (appInfo.sourceDir.equals(resDirPath)) {
                    resDir.set(loadedApk, externalResourceFile);
                }
            }
        }

        // Create a new AssetManager instance and point it to the resources installed under
        final AssetManager assets = context.getAssets();
        addAssetPathMethod = ReflectUtil.findMethod(assets, "addAssetPath", String.class);

        newAssetManager = (AssetManager) ReflectUtil.findConstructor(assets).newInstance();

        if (((Integer) addAssetPathMethod.invoke(newAssetManager, externalResourceFile)) == 0) {
            throw new IllegalStateException("Could not create new AssetManager");
        }

        // Add SharedLibraries to AssetManager for resolve system resources not found issue
        // This influence SharedLibrary Package ID
        if (shouldAddSharedLibraryAssets(appInfo)) {
            for (String sharedLibrary : appInfo.sharedLibraryFiles) {
                if (!sharedLibrary.endsWith(".apk")) {
                    continue;
                }
                if (((Integer) addAssetPathAsSharedLibraryMethod.invoke(newAssetManager, sharedLibrary)) == 0) {
                    throw new IllegalStateException("AssetManager add SharedLibrary Fail");
                }
                Log.i(TAG, "addAssetPathAsSharedLibrary " + sharedLibrary);
            }
        }

        // Kitkat needs this method call, Lollipop doesn't. However, it doesn't seem to cause any harm
        // in L, so we do it unconditionally.
        if (stringBlocksField != null && ensureStringBlocksMethod != null) {
            stringBlocksField.set(newAssetManager, null);
            ensureStringBlocksMethod.invoke(newAssetManager);
        }

        if (SDK_INT >= KITKAT) {
            //pre-N
            // Find the singleton instance of ResourcesManager
            final Class<?> resourcesManagerClass = Class.forName("android.app.ResourcesManager");

            Method mGetInstance = resourcesManagerClass.getDeclaredMethod("getInstance");
            mGetInstance.setAccessible(true);

            final Object resourcesManager = mGetInstance.invoke(null);
            try {
                Field fMActiveResources = ReflectUtil.findField(resourcesManagerClass, "mActiveResources");
                final ArrayMap<?, WeakReference<Resources>> activeResources19 =
                        (ArrayMap<?, WeakReference<Resources>>) fMActiveResources.get(resourcesManager);
                references = activeResources19.values();
            } catch (NoSuchFieldException ignore) {
                // N moved the resources to mResourceReferences
                final Field mResourceReferences = ReflectUtil.findField(resourcesManagerClass, "mResourceReferences");
                references = (Collection<WeakReference<Resources>>) mResourceReferences.get(resourcesManager);
            }
        } else {
            final Field fMActiveResources = ReflectUtil.findField(activityThread, "mActiveResources");
            final HashMap<?, WeakReference<Resources>> activeResources7 =
                    (HashMap<?, WeakReference<Resources>>) fMActiveResources.get(currentActivityThread);
            references = activeResources7.values();
        }
        // check resource
        if (references == null) {
            throw new IllegalStateException("resource references is null");
        }

        for (WeakReference<Resources> wr : references) {
            final Resources resources = wr.get();
            if (resources == null) {
                continue;
            }
            // Set the AssetManager of the Resources instance to our brand new one
            try {
                //pre-N
//                assetsFiled = ReflectUtil.findField(resources, "mAssets");

                assetsFiled.set(resources, newAssetManager);
            } catch (Throwable ignore) {
                // N
                resourcesImplFiled = ReflectUtil.findField(resources, "mResourcesImpl");
                final Object resourceImpl = resourcesImplFiled.get(resources);
                // for Huawei HwResourcesImpl
                final Field implAssets = ReflectUtil.findField(resourceImpl, "mAssets");
                implAssets.set(resourceImpl, newAssetManager);
            }

            clearPreloadTypedArrayIssue(resources);

            resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        }

        // Handle issues caused by WebView on Android N.
        // Issue: On Android N, if an activity contains a webview, when screen rotates
        // our resource patch may lost effects.
        // for 5.x/6.x, we found Couldn't expand RemoteView for StatusBarNotification Exception
        if (SDK_INT >= 24) {
            try {
//                publicSourceDirField = ReflectUtil.findField(ApplicationInfo.class, "publicSourceDir");
                if (publicSourceDirField != null) {
                    publicSourceDirField.set(context.getApplicationInfo(), externalResourceFile);
                }
            } catch (Throwable ignore) {
                // Ignored.
            }
        }

    }

    /**
     * Why must I do these?
     * Resource has mTypedArrayPool field, which just like Message Poll to reduce gc
     * MiuiResource change TypedArray to MiuiTypedArray, but it get string block from offset instead of assetManager
     */
    private static void clearPreloadTypedArrayIssue(Resources resources) {
        // Perform this trick not only in Miui system since we can't predict if any other
        // manufacturer would do the same modification to Android.
        // if (!isMiuiSystem) {
        //     return;
        // }
        Log.w(TAG, "try to clear typedArray cache!");
        // Clear typedArray cache.
        try {
            final Field typedArrayPoolField = ReflectUtil.findField(Resources.class, "mTypedArrayPool");
            final Object origTypedArrayPool = typedArrayPoolField.get(resources);
            final Method acquireMethod = ReflectUtil.findMethod(origTypedArrayPool, "acquire");
            while (true) {
                if (acquireMethod.invoke(origTypedArrayPool) == null) {
                    break;
                }
            }
        } catch (Throwable ignored) {
            Log.e(TAG, "clearPreloadTypedArrayIssue failed, ignore error: " + ignored);
        }
    }

    private static boolean shouldAddSharedLibraryAssets(ApplicationInfo applicationInfo) {
        return SDK_INT >= Build.VERSION_CODES.N && applicationInfo != null &&
                applicationInfo.sharedLibraryFiles != null;
    }

    public static Object getActivityThread(Context context,
                                           Class<?> activityThread) {
        try {
            if (activityThread == null) {
                activityThread = Class.forName("android.app.ActivityThread");
            }
            Method m = activityThread.getMethod("currentActivityThread");
            m.setAccessible(true);
            Object currentActivityThread = m.invoke(null);
            if (currentActivityThread == null && context != null) {
                // In older versions of Android (prior to frameworks/base 66a017b63461a22842)
                // the currentActivityThread was built on thread locals, so we'll need to try
                // even harder
                Field mLoadedApk = context.getClass().getField("mLoadedApk");
                mLoadedApk.setAccessible(true);
                Object apk = mLoadedApk.get(context);
                Field mActivityThreadField = apk.getClass().getDeclaredField("mActivityThread");
                mActivityThreadField.setAccessible(true);
                currentActivityThread = mActivityThreadField.get(apk);
            }
            return currentActivityThread;
        } catch (Throwable ignore) {
            return null;
        }
    }
}
