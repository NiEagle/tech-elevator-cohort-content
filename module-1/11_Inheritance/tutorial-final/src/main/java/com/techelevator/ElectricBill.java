package com.techelevator;

public class ElectricBill extends Bill {
    private int wattsUsed;
    private boolean isLateCharge;
//Constructor
    public ElectricBill(String accountNumber, double baseBalance, int wattsUsed,boolean isLateCharge) {
        super(accountNumber, baseBalance + (wattsUsed * 1.9999)); //ADDED A FEE
        this.wattsUsed = wattsUsed;
        this.isLateCharge = isLateCharge;
    }

public void payBill(double paymentAmount){
        double obnoxiousLateFee = 10.00;

        if(this.isLateCharge){
            paymentAmount = paymentAmount - obnoxiousLateFee;
        }
        super.payBill(paymentAmount);

}


    //Getters/Setters

    public int getWattsUsed() {
        return wattsUsed;
    }

    public void setWattsUsed(int wattsUsed) {
        this.wattsUsed = wattsUsed;
    }
}
