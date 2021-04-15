package com.orange.resourcehotfix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.orange.resourcehotfix.networkmodel.FixModelFive;
import com.orange.resourcehotfix.networkmodel.FixModelFour;
import com.orange.resourcehotfix.networkmodel.FixModelOne;
import com.orange.resourcehotfix.networkmodel.FixModelThree;
import com.orange.resourcehotfix.networkmodel.FixModelTwo;
import com.orange.resourcehotfix.networkmodel.LoginModel;

public class MainActivity extends AppCompatActivity {

    //aapt2 适配之资源 id 固定
    //https://blog.csdn.net/omnispace/article/details/79788641?utm_term=android%E5%9B%BA%E5%AE%9A%E8%B5%84%E6%BA%90%E6%96%87%E4%BB%B6%E7%9A%84id&utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~sobaiduweb~default-5-79788641&spm=3001.4430

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        TextView fix_one = findViewById(R.id.fix_one);
        TextView fix_two = findViewById(R.id.fix_two);
        TextView fix_three = findViewById(R.id.fix_three);
        TextView fix_four = findViewById(R.id.fix_four);
        TextView fix_five = findViewById(R.id.fix_five);

        fix_one.setText(new FixModelOne().getText());
        fix_two.setText(new FixModelTwo().getText());
        fix_three.setText(new FixModelThree().getText());
        fix_four.setText(new FixModelFour().getText());
        fix_five.setText(new FixModelFive().getText());
    }
}
