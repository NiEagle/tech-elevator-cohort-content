package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class App {
    //NO S-OUT HERE USER INTERACTION HAPPENS WITH THE UI
    public static void main(String[] args){
        App app = new App();
        app.run();
    }

    public static void run() {

        OrderUI ui = new OrderUI();
        String userChoice = ui.showMainMenu();
        Kitchen kitchen = new Kitchen();



        while (true) {




            if (userChoice.equals("1")) {

                Order newOrder = ui.takeOrder();
                ui.printMessage("Sending order to the Kitchen");
                boolean isReady = false;
                try {
                    isReady = kitchen.cook(newOrder);


                    if (isReady) {
                        ui.printMessage("Your order is ready");
                    } else {
                        ui.printMessage("Your order is not ready");
                    }
                }
                catch(IngredientOutOfStockException e){
                        ui.printMessage("We are out of stock Sorry >:)");
                    }




            } else if (userChoice.equals("2")) {
                ui.printMessage("Not Implemented");
                //print order
            } else if (userChoice.equals("3")) {
                //exit
                break;

            } else {
                ui.printMessage("Invalid input. Please try again.");
                //error
            }
            System.out.println("Thank you, goodbye!");
        }


    }
//    //create an instance of the ui
//    OrderUI ui = new OrderUI();
//
//    // call the ui to get us a order
//    Order newOrder = ui.takeOrder();
//
//
//    //print the order
//        newOrder.printOrder();

}
