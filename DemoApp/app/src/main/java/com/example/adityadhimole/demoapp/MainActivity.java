package com.example.adityadhimole.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickFunction(View view) {
        ImageView image=(ImageView) findViewById(R.id.MyImageView);
        image.setImageResource(R.drawable.download2);
        Log.i("info","Button Clicked!");
    }
}
