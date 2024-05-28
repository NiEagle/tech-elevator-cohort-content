package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BillPaymentApp {
    public static void main(String[] args) {

        Bill myBill = new Bill("ABC", 50.00);
        NetflixBill nfb = new NetflixBill("CCCC",17.99, 99);
        ElectricBill eb = new ElectricBill("BBB", 100.98, 10, true);



//        Bill newBill = new NetflixBill("DDDD", 10,10);
//        Bill newEBBill = new ElectricBill("EEEE", 100.00,100, false);
//
//
//        List<Bill> myBills = new ArrayList<>();
//        myBills.add(newBill);
//        myBills.add(newEBBill);
nfb.payBill(10.00);
eb.payBill(100.00);











    }
}
