package com.techelevator;


import java.util.Scanner;

public class dogYears {
    public static void main(String[] args) {
        Scanner ageScanner  = new Scanner(System.in);


        System.out.println("Please enter your age as a whole number");
        String ageOfHumanAsAString = ageScanner.nextLine();

        int ageOfHumanAsInteger = Integer.parseInt(ageOfHumanAsAString);
        int ageInDogYears = ageOfHumanAsInteger * 7;
        System.out.println("A human who is " + ageOfHumanAsInteger + " is " + ageInDogYears + " in dog years");









        //  Option 2
//        Scanner ageScanner  = new Scanner(System.in);
//
//        System.out.println("Please enter your age as a whole number");
//        int humanAge = ageScanner.nextInt();
//        ageScanner.nextLine();
//
//        System.out.println("Favorite color?");
//        String color = ageScanner.nextLine();
//
//
//
//        System.out.println("Your age is: " + humanAge + " Youre favorite color is: " + color);// Option 2

    }
}
