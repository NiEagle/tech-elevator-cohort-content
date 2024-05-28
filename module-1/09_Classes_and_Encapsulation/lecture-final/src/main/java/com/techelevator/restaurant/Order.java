package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //List of foods
    private List<Burger> burgers = new ArrayList<>();
    public void addBurgerToOrder(Burger newBurgerToAdd) {
    burgers.add(newBurgerToAdd);
    }
    public void printOrder(){

        int row = 1;
        for(Burger b: burgers){
            System.out.println(row + ", " + b.getBunType() + "" + b.getHowCooked());
        }
    }


    // Questions
    //What do you want
    //Bun
    //Meat
    //Doneness

}
