package com.example.administrator.outer;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button outer_animantion;
    private Button button_walk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outer_animantion = findViewById(R.id.outer_animantion);
        button_walk = findViewById(R.id.button_walk);

    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.outer_animantion:
//                Intent intent = new Intent(getApplicationContext(),DrawArrow.class);
//                startActivity(intent);
//                finish();
//                break;
//            case R.id.button_walk:
//                Intent intent1 = new Intent(getApplicationContext(),WalkActivity.class);
//                startActivityForResult(intent1, CONTEXT_INCLUDE_CODE);
//                overridePendingTransition(R.anim.in_from_right_abit,R.anim.out_from_right_abit);
//                break;
//        }
//    }

    public void outer(View view) {
        Intent intent = new Intent(this, DrawArrow.class);
        startActivity(intent);
        finish();
    }

    public void walk(View view) {
        Intent intent = new Intent(this, WalkActivity.class);
        startActivityForResult(intent, CONTEXT_INCLUDE_CODE);
        overridePendingTransition(R.anim.in_from_right_abit,R.anim.out_from_right_abit);
        finish();

    }


}
