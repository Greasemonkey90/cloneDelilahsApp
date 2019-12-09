package com;

import android.app.Activity;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.util.TimeUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;


import com.bunny.android.delilahsapp.R;
import com.bunny.android.theProblem;

import org.w3c.dom.Text;


public class calculating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math_screen);
        showEverything();
    }

    EditText answerInput;
    int isRight = 0;
    String guess;
    theProblem decision = new theProblem();
    String whichGrade;
    String answer;

    public void showEverything(){
        whichGrade = null;
        guess = null;
        answer = null;
        theTest();
        TextView problem = findViewById(R.id.whereProblemShows);
        problem.setText(whichGrade);

    }
    public void theTest(){
        whichGrade = decision.firstGradeAddition();
        answer = decision.gettingAnswer();
    }



    public void checkingAnswer() {
        TextView lettingYouKnow = findViewById(R.id.isRightView);
        answerInput = findViewById(R.id.roomForAnswer);
        guess = answerInput.getText().toString();
        String wrongOrRight;
        if (guess.equals(answer)) {
            Toast.makeText(this, "You are right", Toast.LENGTH_LONG).show();
            isRight++;
            setContentView(R.layout.math_screen);
            showEverything();

        } else {
            wrongOrRight = "Try again";
            lettingYouKnow.setText(wrongOrRight);
            }

        }
        public void theLastOne(){

            try{
                Thread.sleep(3000);
                finish();
            }catch (InterruptedException e){
                Log.v("ATTENTION","DIDNT WORK");

            }


        }
    public void buttonView(View view){
        final Button answerButton = findViewById(R.id.isItRight);
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkingAnswer();
                if (isRight == 2) {
                    TextView test22 = findViewById(R.id.testing2);
                    test22.setText("GOOD JOB!");
                    theLastOne();
                }
                                 }
        });

    }



}
