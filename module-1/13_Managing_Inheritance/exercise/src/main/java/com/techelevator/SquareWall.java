package com.techelevator;

public class SquareWall extends RectangleWall{




    //CONSTRUCTOR
    public SquareWall(String name, String color, int sideLength){

        super(name,color,sideLength,sideLength);


    }

    //METHODS
    public String toString() {

       String response =  getName() + " (" + String.valueOf(getLength()) + "x" + String.valueOf(getLength()) + ") " + "square";
        return response;
    }

}
