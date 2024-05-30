package com.techelevator;

import javax.lang.model.element.NestingKind;
import java.util.*;

public class BankCustomer {

    //CLASS VARIABLES
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>() ;


    //CONSTRUCTORS

    //METHODS
    public Accountable[] getAccounts(){
        return accounts.toArray(Accountable[]::new);
    }
    public void addAccount(Accountable newAccount){
    accounts.add(newAccount);
    }
    public boolean isVip(){
       int netWorth = 0;
        for(Accountable a : accounts){
            netWorth += a.getBalance();
        }
        if (netWorth >= 25000){
            return true;
        }
        return false;
    }

    //GETTERS/SELLERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
