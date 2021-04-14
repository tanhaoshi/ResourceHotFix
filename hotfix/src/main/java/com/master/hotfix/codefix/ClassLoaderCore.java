package com.master.hotfix.codefix;

import com.master.hotfix.reflect.ReflectUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * create by ths on 2021/2/25
 */
public class ClassLoaderCore {
    /**
     * 目前有三种情况下 会出现 选择性的加载 dex 方式
     */
    //23和19的差别，就是 makeXXXElements 方法名和参数要求不同
    //后者是 makeDexElements(ArrayList<File> files, File optimizedDirectory,ArrayList<IOException> suppressedExceptions)
    //前者是 makePathElements(List<File> files, File optimizedDirectory,List<IOException> suppressedExceptions)
    public static void hookV23(ClassLoader classLoader, List<File> outDexFilePath,File optimizedDirectory)
            throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    //1.取得PathClassLoader的pathList的属性
        Field pathList = ReflectUtil.findField(classLoader, "pathList");
    //2.取得PathClassLoader的pathList的属性真实值（得到一个DexPathList对象）
        Object dexPathListObj = pathList.get(classLoader);
    //3.获得DexPathList中的dexElements 属性
        Field dexElementsField = ReflectUtil.findField(dexPathListObj,"dexElements");
    //4.获得DexPathList对象中dexElements 属性的真实值
        Object[] oldElements = (Object[]) dexElementsField.get(dexPathListObj);

        //开始构建makeDexElements的实参
        List<File> files = new ArrayList<>();
        files.addAll(outDexFilePath);
        List<IOException> ioExceptions = new ArrayList<>();
        //获得 DexPathList 的 makePathElements 方法
        Method makePathElementsMethod = ReflectUtil.findMethod(
                dexPathListObj, "makePathElements", List.class, File.class, List.class);
        assert makePathElementsMethod != null;
        //构建出一个新的Element数组
        //这个方法是静态方法，所以不需要传实例,直接invoke;这里取得的返回值就是 我们外部的dex文件构建成的 Element数组
        Object[] newElements = (Object[]) makePathElementsMethod.invoke(
                null, files, optimizedDirectory, ioExceptions);

        //下面把新数组和旧数组合并，注意新数组放前面
        Object[] dexElements = null;
        if (newElements != null && newElements.length > 0) {
            //先建一个新容器
            dexElements = (Object[]) Array.newInstance(oldElements.getClass().getComponentType(),
                    oldElements.length + newElements.length);
            /**
             *    1~5个参数解释
             *    Object src   : 原数组
             *    int srcPos   : 从元数据的起始位置开始
             * 　　Object dest : 目标数组
             * 　　int destPos : 目标数组的开始起始位置
             * 　　int length  : 要copy的数组的长度
             */
            //新来的数组放前面
            System.arraycopy(
                    newElements, 0, dexElements, 0, newElements.length);

            //再将老数组dex放在新数组后面
            System.arraycopy(
                    oldElements, 0, dexElements, newElements.length, oldElements.length);
        }
        //将新构建好的容器 属性设置进去
        dexElementsField.set(dexPathListObj,dexElements);
    }

    public static void hookV19(ClassLoader classLoader, List<File> outDexFilePath,File optimizedDirectory)
            throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field pathList = ReflectUtil.findField(classLoader,"pathList");
        Object dexPathListObj = pathList.get(classLoader);
        Field dexElementsField = ReflectUtil.findField(dexPathListObj,"dexElements");
        Object[] oldElements = (Object[]) dexElementsField.get(dexPathListObj);

        List<File> files = new ArrayList<>();//开始构建makeDexElements的实参
        files.addAll(outDexFilePath);
        List<IOException> ioExceptions = new ArrayList<>();
        Method makePathElementsMethod = ReflectUtil.findMethod(//获得 DexPathList 的 makeDexElements 方法
                dexPathListObj, "makeDexElements", ArrayList.class, File.class, ArrayList.class);//别忘了后面的参数列表
        Object[] newElements = (Object[]) makePathElementsMethod.invoke(
                null, files, optimizedDirectory, ioExceptions);//这个方法是静态方法，所以不需要传实例,直接invoke;这里取得的返回值就是 我们外部的dex文件构建成的 Element数组

        Object[] dexElements = null;
        if (newElements != null && newElements.length > 0) {
            dexElements = (Object[]) Array.newInstance(oldElements.getClass().getComponentType(), oldElements.length + newElements.length);//先建一个新容器
            //这5个参数解释一下, 如果是将A,B 你找AB的顺序组合成数组C，那么参数的含义，依次是 A对象，A数组开始复制的位置，C对象，C对象的开始存放的位置，数组A中要复制的元素个数
            System.arraycopy(
                    newElements, 0, dexElements, 0, newElements.length);//新来的数组放前面
            System.arraycopy(
                    oldElements, 0, dexElements, newElements.length, oldElements.length);
        }

        //最后把合并之后的数组设置到 dexElements里面
        dexElementsField.set(dexPathListObj, dexElements);
    }

    //14和19的区别，是这个方法 makeDexElements(ArrayList<File> files,File optimizedDirectory)···它又少了一个参数
    public static void hookV14(ClassLoader classLoader, List<File> outDexFilePath, File optimizedDirectory)
            throws IllegalAccessException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
        Field pathList = ReflectUtil.findField(classLoader, "pathList");//1、获得DexPathList pathList 属性
        Object dexPathListObj = pathList.get(classLoader); //2、获得DexPathList pathList对象
        Field dexElementsField = ReflectUtil.findField(dexPathListObj, "dexElements");//3、获得DexPathList的dexElements属性
        Object[] oldElements = (Object[]) dexElementsField.get(dexPathListObj);//4、获得pathList对象中 dexElements 的属性值

        List<File> files = new ArrayList<>();//开始构建makeDexElements的实参
        files.addAll(outDexFilePath);
        List<IOException> ioExceptions = new ArrayList<>();
        Method makePathElementsMethod = ReflectUtil.findMethod(//获得 DexPathList 的 makeDexElements 方法
                dexPathListObj, "makeDexElements", ArrayList.class, File.class);//别忘了后面的参数列表
        Object[] newElements = (Object[]) makePathElementsMethod.invoke(
                null, files, optimizedDirectory, ioExceptions);//这个方法是静态方法，所以不需要传实例,直接invoke;这里取得的返回值就是 我们外部的dex文件构建成的 Element数组

        //下面把新数组和旧数组合并，注意新数组放前面
        Object[] dexElements = null;
        if (newElements != null && newElements.length > 0) {
            dexElements = (Object[]) Array.newInstance(oldElements.getClass().getComponentType(), oldElements.length + newElements.length);//先建一个新容器
            //这5个参数解释一下, 如果是将A,B 你找AB的顺序组合成数组C，那么参数的含义，依次是 A对象，A数组开始复制的位置，C对象，C对象的开始存放的位置，数组A中要复制的元素个数
            System.arraycopy(
                    newElements, 0, dexElements, 0, newElements.length);//新来的数组放前面
            System.arraycopy(
                    oldElements, 0, dexElements, newElements.length, oldElements.length);
        }

        //最后把合并之后的数组设置到 dexElements里面
        dexElementsField.set(dexPathListObj, dexElements);
    }
}
