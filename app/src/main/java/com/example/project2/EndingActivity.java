package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Status.getInstance().getCount() <= 3){
            setContentView(R.layout.activity_ending);
        } else if(Status.getInstance().getCount() >= 4 && Status.getInstance().getCount() <= 7){
            setContentView(R.layout.activity_ending2);
        } else if(Status.getInstance().getCount() < 100){
            setContentView(R.layout.activity_ending3);
        } else {
            setContentView(R.layout.activity_ending4);
        }

        final Button start = findViewById(R.id.restart);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Status.getInstance().resetCount();
                toMain();
            }
        });
    }

    public void toMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}