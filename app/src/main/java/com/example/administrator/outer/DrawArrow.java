package com.example.administrator.outer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/8/24 0024.
 */

public class DrawArrow extends Activity {

    private ImageView runing;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runing);
        runing = findViewById(R.id.runing);
        init();
    }

    @SuppressLint("ClickableViewAccessibility")
    private void init() {
        runing.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(DrawArrow.this,"ni hao ", Toast.LENGTH_SHORT).show();

                break;
            case MotionEvent.ACTION_MOVE:
            break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return false;
    }
});
    }
}
