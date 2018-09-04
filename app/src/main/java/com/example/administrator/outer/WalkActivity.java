package com.example.administrator.outer;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


import com.example.administrator.outer.step.utils.SharedPreferencesUtils;
import com.example.administrator.outer.view.StepArcView;

/**
 * Created by Administrator on 2018/8/27 0027.
 */

public class WalkActivity extends Activity {


    private TextView today_walk;
    private StepArcView cc;
    private Button share;
    private SharedPreferencesUtils sp;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题
        setContentView(R.layout.activity_walk);
        today_walk = findViewById(R.id.today_walk);
        cc = findViewById(R.id.cc);
        share = findViewById(R.id.share);
        initData();
    }

    private void initData() {
        sp = new SharedPreferencesUtils(this);
        //获取用户设置的计划锻炼步数，没有设置过的话默认7000
        String planWalk_QTY = (String) sp.getParam("planWalk_QTY", "7000");
        //设置当前步数为0
        cc.setCurrentCount(Integer.parseInt(planWalk_QTY), 0);
//        setupService();
    }

}
