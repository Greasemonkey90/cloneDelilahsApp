package com.bunny.android;

import java.util.Random;

public class theProblem {
     private Random rNum = new Random();
     private int firstNumber = 0;
     private int secondNumber = 0;


    public String kindergartenAddition() {
        firstNumber = rNum.nextInt(10);
        secondNumber = rNum.nextInt(10);

        return firstNumber + " + " + secondNumber + " = ";
    }

    public String firstGradeAddition() {
        firstNumber = rNum.nextInt(20);
        secondNumber = rNum.nextInt(20);

        return firstNumber + " + " + secondNumber + " = ";
    }

    public String gettingAnswer(){
        int answer = firstNumber + secondNumber;
        return Integer.toString(answer);
    }
    }


