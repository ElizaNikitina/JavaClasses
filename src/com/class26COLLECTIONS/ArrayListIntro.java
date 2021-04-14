package com.class26COLLECTIONS;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<10; i++){
            numbers.add(i);
        }

        for(Integer num:numbers){
            System.out.print(num+ " ");
        }
    }
}
