package com.techelevator;

public class RectangleWall extends Wall{


    //CLASS VARIABLES
    private int length;
    private int height;


    public RectangleWall(String name, String color,int length, int height){

        super(name,color);

        this.length = length;
        this.height = height;
    }

    //METHOD
public String toString(){
    String response = getName() + (" (" + String.valueOf(length) + "x" + String.valueOf(height) + ") " + "rectangle");
    return response;
}

    public int getArea() {
        return length * height;
    }
    //GETTERS


    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

}
