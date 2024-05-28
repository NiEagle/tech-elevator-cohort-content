package com.techelevator;

public class Bill {
//CLASS AKA INSTANCE AKA PROPERTIES AKA MEMBER VARIABLES
    private String accountNumber;
    private double balance = 0;


//CONSTRUCTOR
    public Bill(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //METHODS

    public void payBill(double paymentAmount){
        if(paymentAmount > 0) {

            balance -= paymentAmount;
        }
    }


    //GETTERS
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


}
