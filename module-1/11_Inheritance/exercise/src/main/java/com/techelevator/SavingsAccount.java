package com.techelevator;

public class SavingsAccount  extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
    //METHODS
    public int withdraw(int amountToWithdraw){
        int balance = getBalance();
        int serviceCharge = 2;
        amountToWithdraw = amountToWithdraw + serviceCharge;
    super.withdraw(amountToWithdraw);
        return amountToWithdraw;
}
}