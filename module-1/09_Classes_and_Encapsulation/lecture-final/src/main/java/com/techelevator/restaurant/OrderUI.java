package com.techelevator.restaurant;

import java.io.SequenceInputStream;
import java.util.Scanner;

public class OrderUI {
    private Scanner myScanner = new Scanner(System.in);





    public Order takeOrder() {

        Order newOrder = new Order();

        //Create a burger
        Burger burger = new Burger();

        //ask for 3 ingredients
        System.out.println("What type of bun would you like?");
        String bunType = myScanner.nextLine();
        burger.setBunType(bunType);

        System.out.println("How would you like the burger cooked?");
        String howCooked = myScanner.nextLine();
        burger.setHowCooked(howCooked);

        System.out.println("Please enter your desired ingredients(seperated by comas)");
        String ingredientsAsString = myScanner.nextLine();
        ingredientsAsString.split(",");


        //add burger to order
        newOrder.addBurgerToOrder(burger);


        return newOrder;


    }
}
