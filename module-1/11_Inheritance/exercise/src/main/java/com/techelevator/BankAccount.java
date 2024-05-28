package com.techelevator;

public class BankAccount {

    //CLASS VARIABLES
    private String accountHolderName;
    private String accountNumber;
    private int balance = 0;


    //CONSTRUCTOR
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   //METHODS
    public int deposit(int amountToDepoit){
        return this.balance + amountToDepoit;
    }
   public int withdraw(int amountToWithdraw){
        if(balance >= amountToWithdraw){
        return this.balance - amountToWithdraw;
        }
    return balance;
    }


    //GETTERS
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
