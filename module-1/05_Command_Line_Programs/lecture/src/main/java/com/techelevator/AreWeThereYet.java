package com.techelevator;

import java.util.Scanner;

public class AreWeThereYet {

    public static <scanner> void main(String[] args) {

        Scanner keyBoardScanner = new Scanner(System.in);

        boolean there = false;

        while (true) {

            System.out.println("Are we there yet (Y)es or (N)o");
            String response = keyBoardScanner.nextLine();
///                                       .nextLine allows the clearing of /n from the q.
            System.out.println(response);

            if (response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("Y")) {
                System.out.println("Cowabunga!");
                break;


            } else if (response.equalsIgnoreCase("No") || response.equalsIgnoreCase("N")) {
                System.out.println("Eat thy trousers");
            } else {
                System.out.println("Come on man>:[");
            }
        }
    }

}
