package com.practiceInterview;

public class IsPrime {

    public static void checkIsPrime(int n){

        boolean isPrime = true;

        if(n>1){
            for(int i=2; i<n; i++){
                if(n%1==0){
                    isPrime = true;
                    break;
                }
            }
        }else{
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is NOT a prime number");
        }
    }

    public static void main(String[] args) {
        checkIsPrime(7);

    }
}
