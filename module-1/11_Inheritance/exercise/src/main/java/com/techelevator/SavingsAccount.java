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
        int serviceFeeCharge = 2;
        int balance = getBalance();
        int updatedBalance = balance - amountToWithdraw;

        if (updatedBalance - serviceFeeCharge < 0){
            return balance;
        }
        else if(updatedBalance  < 150 ){
            amountToWithdraw = (amountToWithdraw + serviceFeeCharge);
            return super.withdraw(amountToWithdraw);

        }

        else {
            return super.withdraw(amountToWithdraw);
        }
    }

}
