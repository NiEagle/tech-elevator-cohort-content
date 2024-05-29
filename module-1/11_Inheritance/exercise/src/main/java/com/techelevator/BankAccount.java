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
        if(amountToDepoit > 0) {
            this.balance = this.balance + amountToDepoit;
        }
        return this.balance;
    }
   public int withdraw(int amountToWithdraw){
       if(amountToWithdraw > 0) {
          this.balance = this.balance - amountToWithdraw;
       }
       return this.balance;
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
