package com.techelevator.restaurant;

import java.util.List;

public class Kitchen {

    public boolean cook(Order order)throws IngredientOutOfStockException{

        List<Burger> burgers = order.getBurgers();
        boolean hasIngredients = false;

        if (burgers != null) {


            for (Burger burger : burgers) {

                //CHECK INGREDIENTS
                List<Ingredient> requestedIngreideients = burger.getToppings();
                //pretend we are out of stock
               if(!hasIngredients) {
                   throw new IngredientOutOfStockException();
               }
            //TODO PREPARE BURGER AND COOK
            }

            return true;
        }

            return false;

    }
}
