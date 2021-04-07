package com.InterviewQuestion;

public class RemoveElementFromArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] copy = new int[array.length - 1];
        int index = 4;
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                copy[j++] = array[i];
            }
        }

        for(int b:copy){
            System.out.print(b+ " ");
        }
    }
}
