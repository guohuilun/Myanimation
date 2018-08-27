package com.example.administrator.outer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button outer_animantion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void outer(View view) {
        Intent intent = new Intent(this,Nimantion.class);
        startActivity(intent);
        finish();
    }

    public void walk(View view) {
        Intent intent = new Intent(this, WalkActivity.class);
        startActivity(intent);
        finish();
    }
}
