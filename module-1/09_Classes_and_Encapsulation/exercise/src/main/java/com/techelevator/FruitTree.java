package com.techelevator;

public class FruitTree {


    //CLASS VARIABLES
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    //GETTERS
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    //constructors
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }


    //method
    //It returns false if no fruit was picked—that is, piecesOfFruitLeft was less than numberOfPiecesToRemove.
    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (this.piecesOfFruitLeft - numberOfPiecesToRemove < 0) {
            return false;
        } else {
            this.piecesOfFruitLeft = this.piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        }
    }


}

