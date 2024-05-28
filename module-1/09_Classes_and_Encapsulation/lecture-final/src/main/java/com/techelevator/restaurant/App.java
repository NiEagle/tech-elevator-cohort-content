package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

    //Create an instance of the UI
        OrderUI uI = new OrderUI();

        //Call ui to get us the order
        Order newOrder = uI.takeOrder();

        //print the order
        newOrder.printOrder();
    }

}
