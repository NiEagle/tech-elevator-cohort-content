package com.techelevator;

public class ArrayExmple {

    public static void main(String[] args) {



        int numberOfStudents = 5;

        String[] names = new String[numberOfStudents];


        /////                        //This tells JVM how much memory to allocate
        int[] nums = new int[10];
        boolean[] whatIfs = new boolean[7];

        //BE ABLE TO PUT THINGS INTO AN ARRAY
        names[2] = "Josh";
        names[1] = "Josh";

        System.out.println("The name at index 2 is: " + names[2]);
        System.out.println("The size of the array is: " + nums.length);


        //Static initialization of an array
        double[] decimalNumbers = new double [] {0.1, 0.1, 0.1, 0.1, 0.1};
    }
}