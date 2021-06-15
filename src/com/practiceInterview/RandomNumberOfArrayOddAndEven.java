package com.practiceInterview;

public class RandomNumberOfArrayOddAndEven {
    public static void main(String[] args) {

        int limit = 10;
        int[]array = new int[limit];
        for(int i = 0; i<limit; i++){
            int randomNum = (int) (Math.random() * ((20 - 1) + 1) + 1);
            array[i] = randomNum;

        }
        for(int a: array) {
            if (a % 2 == 0) {
                System.out.println("Even: " + a);
            }
        }
        for(int a: array) {
            if (a % 2 != 0) {
                System.out.println("Odd: " + a);
            }
        }
    }
}
