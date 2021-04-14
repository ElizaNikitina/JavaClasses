package com.class27ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<>();

        car.add("audi");
        car.add("lada");
        car.add("toyota");
        car.add("Cadillac");

        for (String a : car) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (int a = 0; a < car.size(); a++) {
            System.out.print(car.get(a) + " ");
        }

        System.out.println();

        Iterator<String> iter = car.iterator();
        while (iter.hasNext()) {
            String a = iter.next();
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("============");

        ArrayList<String> word = new ArrayList<>();

        word.add("book");
        word.add("lake");
        word.add("baker");
        word.add("brake");
        System.out.print(word);
        Iterator<String> iter1 = word.iterator();
        while (iter1.hasNext()) {
            if(iter1.next().endsWith("e")){
                iter1.remove();
            }

        }
        System.out.println();
        System.out.print(word);
    }
}
