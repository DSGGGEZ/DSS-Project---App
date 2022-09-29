package com.example.dssproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnStart = (ImageButton) findViewById(R.id.StartButton);
        btnStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        ImageButton btnAbout = (ImageButton) findViewById(R.id.AboutButton);
        btnAbout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutActivity();
            }
        });
    }
        public void openActivity2(){
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
        }
    public void openAboutActivity(){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}
