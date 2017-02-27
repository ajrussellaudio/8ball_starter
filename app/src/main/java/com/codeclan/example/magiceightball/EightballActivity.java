package com.codeclan.example.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class EightballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightball);


        String helloWorld = "Hello, World!";
        Log.d("EightBallTag", helloWorld);
    }
}
