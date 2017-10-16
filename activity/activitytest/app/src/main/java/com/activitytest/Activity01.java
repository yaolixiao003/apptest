package com.activitytest;

/**
 * Created by oxiao on 2016/10/24.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity01 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);  /* 设置显示main.xml布局 */


        Button button = (Button)this.findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                //新建一个Intent
                Intent intent = new Intent();
                //制定intent要启动的类
                intent.setClass(Activity01.this, Activity02.class);
                //启动一个新的Activity
                startActivity(intent);
                //关闭当前的
                Activity01.this.finish();

            }
        });
    }

}
