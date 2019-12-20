package com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.bunny.android.delilahsapp.R;


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
        //whichGrade = null;
        guess = null;
        answer = null;
        theTest();
        TextView problem = findViewById(R.id.whereProblemShows);
        problem.setText(whichGrade);

    }
    public void theTest(){
        whichGrade = decision.test();
        System.out.println(whichGrade);
        if(whichGrade.contains("+")){
            answer = decision.gettingSum();
        }
        else{
            answer = decision.gettingDifference();
        }

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
                    test22.setText(R.string.right_answer);
                    theLastOne();
                }
                                 }
        });

    }



}
