package com.techelevator.farm.office;

import javax.lang.model.element.NestingKind;

public class Marker implements Sellable{

    private String brand;
    private String color;
    private double price;
    private int quantityOnHand;
    private String itemName;


  //METHODS

    public Marker(String brand, String color, double price, int initialQuantity, String itemName){
        this.brand = brand;
        this.color = color;
        this.price = price;

        this.itemName = itemName;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getInventoryCount() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
    this.price = price;
    }

    @Override
    public int addToInventory(int quantityToAdd) {
        return quantityOnHand = quantityOnHand + quantityToAdd;
    }

    @Override
    public String getItemName() {
        return null;
    }
}
