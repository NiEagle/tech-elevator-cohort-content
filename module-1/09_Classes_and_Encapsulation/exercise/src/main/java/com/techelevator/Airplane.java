package com.techelevator;

public class Airplane {

    //CLASS VAIRIABLES
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;

    //GETTERS


    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    //CONSTRUCTOR
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    //METHOD
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
//If forFirstClass is true, add totalNumberOfSeats to the value for bookedFirstClassSeats.
//If forFirstClass is false, add totalNumberOfSeats to the value for bookedCoachSeats.
//It returns true if there were enough seats to make the reservation, otherwise it returns false and the number of booked seats doesn't change.
        if(forFirstClass) {
            this.bookedFirstClassSeats = this.bookedCoachSeats + totalNumberOfSeats;
            if(this.totalFirstClassSeats - this.bookedFirstClassSeats > 0){

            }
        }
        else if(!forFirstClass) {
            this.bookedCoachSeats = this.bookedCoachSeats + totalNumberOfSeats;
            if(this.totalCoachSeats - this.bookedCoachSeats > 0){

            }
        }
        else if (this.totalFirstClassSeats - this.bookedFirstClassSeats > 0 || this.totalCoachSeats - this.bookedCoachSeats > 0) {
            return true;


        }


        return false;
    }
    public int getAvailableFirstClassSeats(){
        return this.totalFirstClassSeats - this.bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats(){
        return this.totalCoachSeats - this.bookedCoachSeats;
    }
}

