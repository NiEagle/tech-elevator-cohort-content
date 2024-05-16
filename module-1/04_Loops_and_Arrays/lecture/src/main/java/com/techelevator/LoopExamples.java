package com.techelevator;

public class LoopExamples {

    public static void main(String[] args) {
        long start  = System.currentTimeMillis();

        for(int i = 0; i < 10000000; i++){

        }
        long stop = System.currentTimeMillis();
        long totalTime = stop - start;

        System.out.println("Total execute time = " + totalTime);
    }
}
