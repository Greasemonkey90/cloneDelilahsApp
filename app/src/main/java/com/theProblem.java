package com;

import org.w3c.dom.DOMStringList;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class theProblem {
    private Random rNum = new Random();
    private int firstNumber = 0;
    private int secondNumber = 0;
    private String problem;
    //public ArrayList<String> arr = new ArrayList<>();


    public String kindergartenAddition() {
        int firstNumber = rNum.nextInt(10);
        int secondNumber = rNum.nextInt(10);

        return firstNumber + " + " + secondNumber + " = ";
    }

    public String firstGradeAddition() {
        firstNumber = rNum.nextInt(20);
        secondNumber = rNum.nextInt(20);
        //arr.add(firstNumber + " + " + secondNumber + " = ");
        // arr.add(secondGradeSubtraction());
        return firstNumber + " + " + secondNumber +" = ";
    }

    public String secondGradeSubtraction() {
        firstNumber = rNum.nextInt(30);
        secondNumber = rNum.nextInt(30);
        while (secondNumber > firstNumber) {
            secondNumber = rNum.nextInt(30);
        }


        return (firstNumber + " - " + secondNumber + " = ");
    }
//This is in there as test because I want to make it first grade math and second grade math.
    //Before it was just addition but by adding this method, I can integrate both
// addition and subtraction randomly into the pop ups.
    public String test() {

        Random level = new Random();
        int theNumber = level.nextInt(2);
        if (theNumber == 0) {
          problem = firstGradeAddition();
        }
        if (theNumber == 1) {
            problem = secondGradeSubtraction();
            }

            return problem;
        }

        public String gettingSum () {
            int answer = firstNumber + secondNumber;
            return Integer.toString(answer);
        }
        public String gettingDifference () {
            int answer = firstNumber - secondNumber;
            return Integer.toString(answer);
        }
    }



