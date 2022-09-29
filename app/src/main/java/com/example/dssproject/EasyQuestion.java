package com.example.dssproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EasyQuestion extends AppCompatActivity implements View.OnClickListener{

    TextView showScore;
    TextView question;
    Button ansA,ansB,ansC,ansD;
    Button submitbtn;

    int score = 0;
    int totalQuestion =QuestionAnswer.easyquestion.length;
    int currentQuestionIndex = 0;

    String selectedAns = "";
    int ansValue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_question);

        showScore = findViewById(R.id.showscore);
        question = findViewById(R.id.question);
        ansA = findViewById(R.id.ansA);
        ansB = findViewById(R.id.ansB);
        ansC = findViewById(R.id.ansC);
        ansD = findViewById(R.id.ansD);
        submitbtn = findViewById(R.id.submitbtn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitbtn.setOnClickListener(this);

        loadNewQuestion();

    }
    @Override
    public void onClick(View view){

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;

        //get Answer By ID
        if(clickedButton.getId()==R.id.ansA){
            ansValue=1;
        }
        else if(clickedButton.getId()==R.id.ansB){
            ansValue=2;
        }
        else if(clickedButton.getId()==R.id.ansC){
            ansValue=3;
        }
        else if(clickedButton.getId()==R.id.ansD){
            ansValue=4;
        }

        if (clickedButton.getId()==R.id.submitbtn){
            if(ansValue==QuestionAnswer.correcteasychoice[currentQuestionIndex]){
                score+=1;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        }else{
            selectedAns = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.YELLOW);
        }

    }
    public void loadNewQuestion(){
        showScore.setText("Score : "+score);
        if(currentQuestionIndex==totalQuestion) {
            SumScore.setScore(score);
            finishQuiz();
            return;
        }
        question.setText(QuestionAnswer.easyquestion[currentQuestionIndex]);

        ansA.setText(QuestionAnswer.easychoice[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.easychoice[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.easychoice[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.easychoice[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String passStatus="";
        new AlertDialog.Builder(this)
                .setTitle("Your Score")
                .setMessage("คะแนนของคุณคือ "+score+" จากคำถามทั้งหมด "+totalQuestion+" ข้อ")
                .setNegativeButton("เริ่มใหม่",(dialogInterface,i)->restartQuiz())
                .setPositiveButton("กลับสู่เมนูหลัก",(dialogInterface,i)->backToLevelSelect())
                .setCancelable(true)
                .show();
    }
    void restartQuiz(){
        score=0;
        currentQuestionIndex=0;
        loadNewQuestion();
    }
    void backToLevelSelect(){
        Intent it = new Intent(this,MainActivity2.class);
        startActivity(it);
        score=0;
        currentQuestionIndex=0;

    }
}