package com.class24.homework;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance ){
        this.balance=balance;
    }
    void calcInterest(){
        interest=balance*0.15;
        System.out.println("Annual Interest payable: "+interest);
    }
}

class Visa extends CreditCard{
    Visa(double balance ) {
        super(balance);
    }
}

class AX extends CreditCard{
    AX(double balance) {
        super(balance);
    }
    void calcInterest(){
        interest=balance*0.05;
        System.out.println("Annual Interest payable: "+interest);
    }
}

class TestCredit {
    public static void main(String[] args) {
        CreditCard cc=new CreditCard(25000);
        cc.calcInterest();
        Visa v=new Visa(15000);
        v.calcInterest();
        AX a=new AX(20000);
        a.calcInterest();
    }
}
