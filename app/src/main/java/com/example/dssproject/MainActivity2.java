package com.example.dssproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //diff button
        ImageButton btneasy = (ImageButton) findViewById(R.id.easybutton);
        btneasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEasyQuestion();
            }
        });
        ImageButton btnhard = (ImageButton) findViewById(R.id.hardbutton);
        btnhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHardQuestion();
            }
        });

        ImageButton btnback = (ImageButton) findViewById(R.id.backbutton);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }
    public void openEasyQuestion(){
        Intent it = new Intent(this,EasyQuestion.class);
        startActivity(it);
    }
    public void openHardQuestion(){
        Intent it = new Intent(this,HardQuestion.class);
        startActivity(it);
    }
    public void back(){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
    }
}