package com.techelevator;

public class NetflixBill extends Bill {
    private  int hoursWatched;

    public NetflixBill(String accountNumber, double balance, int hoursWatched) {
        super(accountNumber, balance); //pass these values up to parent's constructor
        this.hoursWatched = hoursWatched;
    }


    //GETTER/SETTERS
    public int getHoursWatched() {
        return hoursWatched;
    }

    public void setHoursWatched(int hoursWatched) {
        this.hoursWatched = hoursWatched;
    }
}
