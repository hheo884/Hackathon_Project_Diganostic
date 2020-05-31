package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionActivity extends AppCompatActivity {
    private int questionN;
    private int point;
    public QuestionActivity(){
        point = 1;
        questionN = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toNextScreen();
    }

    public void toNextScreen(){
        questionN++;
        if(questionN == 1){
            setContentView(R.layout.activity_question01);
            point = 1;
            setButtonListener();
        } else if(questionN == 2){
            setContentView(R.layout.activity_question02);
            point = 1;
            setButtonListener();
        } else if(questionN == 3){
            setContentView(R.layout.activity_question03);
            point = 3;
            setButtonListener();
        } else if(questionN == 4){
            setContentView(R.layout.activity_question04);
            point = 1;
            setButtonListener();
        } else if(questionN == 5){
            setContentView(R.layout.activity_question05);
            point = 1;
            setButtonListener();
        } else if(questionN == 6){
            setContentView(R.layout.activity_question06);
            point = 1;
            setButtonListener();
        } else if(questionN == 7){
            setContentView(R.layout.activity_question07);
            point = 4;
            setButtonListener();
        } else if(questionN == 8){
            setContentView(R.layout.activity_question08);
            point = 1;
            setButtonListener();
        } else if(questionN == 9){
            setContentView(R.layout.activity_question09);
            point = 2;
            setButtonListener();
        } else if(questionN == 10){
            setContentView(R.layout.activity_question10);
            point = 2;
            setButtonListener();
        } else if(questionN == 11){
            setContentView(R.layout.activity_question11);
            point = 100;
            setButtonListener();
        } else if(questionN == 12){
            setContentView(R.layout.activity_question12);
            point = 100;
            setButtonListener();
        } else if(questionN == 13){
            setContentView(R.layout.activity_question13);
            point = 100;
            setButtonListener();
        } else if(questionN == 14){
            setContentView(R.layout.activity_question14);
            point = 100;
            setButtonListener();
        } else if(questionN == 15){
            setContentView(R.layout.activity_question15);
            point = 100;
            setButtonListener();
        } else if(questionN == 16){
            Intent intent = new Intent(this, EndingActivity.class);
            startActivity(intent);
        } else if(questionN == -1){
            questionN = 0;
            Status.getInstance().resetCount();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void setButtonListener(){
        final Button yesB = findViewById(R.id.yes);
        yesB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Status.getInstance().increaseCount(point);
                toNextScreen();
            }
        });

        final Button noB = findViewById(R.id.no);
        noB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toNextScreen();
            }
        });

        final Button restart = findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                questionN = -2;
                toNextScreen();
            }
        });
    }
}