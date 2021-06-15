package com.class34FinallyBlock;

class BalanceException extends RuntimeException{

    BalanceException(String message){
        super(message);
    }
}
public class ThrowKeyword {

    public static void main(String[] args) {

        NullPointerException npe = new NullPointerException();

       // throw npe;

       // throwException();

      //  withdraw(1000, 1100);

        browser("wertu");
    }

    public static void withdraw(int balance, int amount) {

        if(amount>balance) {
            throw new BalanceException("You balance is too low"); //RuntimeException //BalanceException
        }
    }

    public  static void throwException(){
        throw new ArithmeticException();
    }


    public static void browser(String browser) {

        switch(browser) {
            case "chrome":
                System.out.println("Using chrome browser");
                break;
            case "firefox":
                System.out.println("Using firefox browser");
                break;
            default:
                throw new RuntimeException("Invalid browser");
        }
    }

}



