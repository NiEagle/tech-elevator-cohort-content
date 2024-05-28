package com.techelevator;

public class Elevator {
    //Class Variables

    private int currentFloor;
    private int numberOfFloors;
    private boolean isDoorOpen;

    //CONSTRUCTOR
    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        this.currentFloor = 1;
    }

    //Getters

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    //METHODS
    public void openDoor() {
        if (!this.isDoorOpen) {
            this.isDoorOpen = true;
        }

    }

    public void closeDoor() {
        if (this.isDoorOpen) {
            this.isDoorOpen = false;
        }
    }

    public void goUp(int desiredFloor) {
        while (this.isDoorOpen == false){
            if(this.currentFloor < desiredFloor) {
                this.currentFloor = this.currentFloor + 1;
                break;
            }

        }
    }
        public void goDown ( int desiredFloor){
            while (this.isDoorOpen == false){
                if(this.currentFloor > desiredFloor) {
                    this.currentFloor = this.currentFloor - 1;
                    break;
                }
            }
        }
    }

//   public void goDown(int desiredFloor){
//       while(this.currentFloor != desiredFloor){
//           this.currentFloor = this.currentFloor - 1;
//       }
//
//
//
//   };

//    void goDown(int desiredFloor){};
//
//}