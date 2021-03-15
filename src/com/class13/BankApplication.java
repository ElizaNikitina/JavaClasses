package com.class13;

public class BankApplication {

    public static void main(String[] args) {

        Account firstAcc = new Account();
        firstAcc.userName = "ElizaNikitina";
        firstAcc.password = "1234qwerty";
        firstAcc.balance = 120046.00;
        firstAcc.accountNumber = "1234567890";
        firstAcc.isLoggedIn = true;

        firstAcc.login("ElizaNikitina", "1234qwerty");
        firstAcc.printInfo();
    }
}
