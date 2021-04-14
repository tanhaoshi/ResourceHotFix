package com.orange.resourcehotfix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //aapt2 适配之资源 id 固定
    //https://blog.csdn.net/omnispace/article/details/79788641?utm_term=android%E5%9B%BA%E5%AE%9A%E8%B5%84%E6%BA%90%E6%96%87%E4%BB%B6%E7%9A%84id&utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~sobaiduweb~default-5-79788641&spm=3001.4430

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
