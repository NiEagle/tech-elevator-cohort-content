package com.techelevator;


public class ScratchPad {
    public static void main(String[] args) {

        System.out.println("I am the main method");
        //creating a ScratchPad object
        ScratchPad scratchPad = new ScratchPad();
        int result = scratchPad.addNumbers(5, 7);
        System.out.println(result);

        boolean isSafe = scratchPad.areWeSafeFromDogsAndBees( true ,  false);
        if(isSafe) {
            System.out.println("Safe");
        } else {
            System.out.println("Not safe!");
        }

        int rate = scratchPad.interestRate(1000);
        System.out.println("Customer interest rate: " + rate + "%");


    }
    //where and what it returns public/datatype/methodName to call/parameters(can be empty)/

    public int addNumbers(int num1, int num2) {
//        take num1 and num2 and add
        int sum = num1 + num2;
//        them return the sum
        return sum;
//        return num1 + num2;
    }

    //accessor/variable variable name
    public boolean areWeSafeFromDogsAndBees(boolean areDogsPresent, boolean areBeesPresent) {
        //check to see if areDogsPresnet or areBeesPresent and if so return false

        if (areDogsPresent || areBeesPresent) {
            return false;
        }

        return true;
    }

    //Calc interest rate based on a customers credit score.
    //Takes in a int credit score
    public int interestRate(int creditScore){
        if(800 <= creditScore && creditScore <= 850){
            return 3;
        }
        else if(740 <= creditScore && creditScore <= 799){
            return 4;
        }
        else if(670 <= creditScore && creditScore <= 739){
            return 5;
        }
        else if(670 <= creditScore && creditScore <= 739){
            return 5;
        }
        else if (300 <= creditScore && creditScore <= 669) {
            return 6;
        }
        else {
            return 150;
        }
// Other teams set the interest rate as a varible which was set in each if statement and then returned at the end of the method
    }
}


