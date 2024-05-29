package com.techelevator;

public class CheckingAccount extends BankAccount{

//CONSTRUCTORS
    public CheckingAccount(String accountHolderName, String accountNumber,int balance) {
        super(accountHolderName, accountNumber,balance);
    }
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    //OVERRIDE METHOD
    public int withdraw(int amountToWithdraw){
        int overDraftFee = 10;
        int balance = getBalance();
        int updatedBalance = balance - amountToWithdraw;

        if(updatedBalance <= -100 ){
        amountToWithdraw = 0;
          return balance;

        }
        else if(updatedBalance < 0 && updatedBalance > -100 ){
          amountToWithdraw = (amountToWithdraw + overDraftFee);
         return super.withdraw(amountToWithdraw);
        }
        else {
            return super.withdraw(amountToWithdraw);
        }
        }


//
//
//    }

}
