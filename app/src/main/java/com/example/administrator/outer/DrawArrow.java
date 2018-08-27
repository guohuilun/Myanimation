package com.example.administrator.outer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/8/24 0024.
 */

public class DrawArrow extends Activity {

    private ImageView runing;
    private Button et_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runing);
        runing = findViewById(R.id.runing);
        et_title = findViewById(R.id.et_title);
        init();
        et_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1,0,1,0, Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF,
                        0.5f);
                scaleAnimation.setDuration(1000);
                scaleAnimation.setFillAfter(true);
                runing.startAnimation(scaleAnimation);
                scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        et_title.setVisibility(View.GONE);
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        finish();


                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void init() {
        runing.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Toast.makeText(DrawArrow.this, "请点击按钮 ", Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Toast.makeText(DrawArrow.this, "请点击按钮 ", Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_UP:
                        Toast.makeText(DrawArrow.this, "请点击按钮 ", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }

}
