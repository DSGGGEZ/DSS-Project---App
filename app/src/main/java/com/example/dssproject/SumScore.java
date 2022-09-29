package com.example.dssproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SumScore extends AppCompatActivity {

    static int score=0;
    TextView showScore;

    public static void setScore(int sc){
        score=sc;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_score);
        showScore.setText(score);



        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                back();
            }
        });
    }
    public void back(){
        Intent it = new Intent(this,MainActivity2.class);
        startActivity(it);
    }

}