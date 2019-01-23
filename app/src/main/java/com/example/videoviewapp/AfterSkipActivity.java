package com.example.videoviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AfterSkipActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_skip_activity);


    }

    public void backMain(View view){
        finish();
        Intent intent = new Intent(getApplication() , MainActivity.class);
        startActivity(intent);
    }
}
