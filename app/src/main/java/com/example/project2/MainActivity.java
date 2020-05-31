package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toQuestion();
            }
        });

        final Button credit = findViewById(R.id.credit);
        credit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toCredit();
            }
        });
    }

    public void toQuestion(){
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }

    public void toCredit(){
        Intent intent = new Intent(this, CreditActivity.class);
        startActivity(intent);
    }

}