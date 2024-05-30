package com.techelevator;

public class CreditCardAccount implements Accountable{

    //CLASS VARIABLES
    private String accountHolderName;
    private String cardNumber;
    private int debt;
    private int balance;

    //CONSTRUCTORS
    public CreditCardAccount(String accountHolderName,String cardNumber){
    this.accountHolderName = accountHolderName;
    this.cardNumber = cardNumber;
    }

    //METHODS
public int pay(int amountToPay){

    return null;
}

public int charge(int amountToCharge){

    return null;
}







    //GETTERS/SETTERS
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public int getBalance() {
        return 0;
    }
}
