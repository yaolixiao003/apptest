package com.activitytest;

/**
 * Created by oxiao on 2016/10/24.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity02 extends Activity{           /*savedInstanceState 保存当前Activity的状态信息。*/

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);         //调用父类的onCreate构造函数)
                                                    /* 设置显示main2.xml布局 */
        setContentView(R.layout.main2);
                                                    /* findViewById(R.id.button2)取得布局main.xml中的button2 */
        Button button = (Button) findViewById(R.id.button2);
                                                    /* 监听button的事件信息 */
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                                                    /* 新建一个Intent对象 */
                Intent intent = new Intent();
                /* 指定intent要启动的类 */
                intent.setClass(Activity02.this, Activity01.class);
                                                    /* 启动一个新的Activity */
                startActivity(intent);
                                                    /* 关闭当前的Activity */
                Activity02.this.finish();
            }

        });
    }
}