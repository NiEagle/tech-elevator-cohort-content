package com.techelevator.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    //CLASS VARIABLES GO HERE
    private String bunType;
    private String howCooked;    //well done, rare,
    private String meatType;      //TODO - Come back later and add a List<Ingredients>

    private List<Ingredient> toppings;


    //CONSTRUCTOR
    public Burger(String meatType) {
        toppings = new ArrayList<>();
        this.meatType = meatType;
    }

    //default constructor - have to put back in because I want one, and if I don't do this, Java won't let me use a default constructor because of the custom one above
    public Burger() {
        toppings = new ArrayList<>();
        this.meatType = "beef";

    }

    public Burger(String meatType, List<toppings>){


        {
            if (toppings == null) {
                this.toppings = new ArrayList<>();
            }


            this.toppings = toppings;
            this.meatType = meatType;
        }

        //GETTERS and SETTERS

        public String getBunType () {
            return bunType;
        }

        public void setBunType (String bunType){
            this.bunType = bunType;
        }
        public void sethowCooked (String howCooked){
            this.howCooked = howCooked;
        }

        public String getHowCooked () {
            return howCooked;
        }

        public void setHowCooked (String howCooked){
            this.howCooked = howCooked;
        }

    }
}