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
}


