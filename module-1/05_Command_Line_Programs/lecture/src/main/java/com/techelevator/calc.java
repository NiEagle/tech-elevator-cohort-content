package com.techelevator;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
//create new scanner
        Scanner numberScanner = new Scanner(System.in);
        //prompt user
        System.out.println("Please enter all the numbers you want to add seperated by comas");
        //capture imput
        String nums = numberScanner.nextLine();
// awnser string cut into an array

        String[] myNums = nums.split(",");

//need to loop to add
//convert values from stirngs to ints

        int sum = 0;
        for(int i = 0; i < myNums.length; i++){

//converts string to int then adds to sum
           sum =  sum + (Integer.parseInt(myNums[i]));
        }
        System.out.println(sum);

    }


}
