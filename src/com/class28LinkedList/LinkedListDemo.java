package com.class28LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Eliza");
        list.add("Artem");
        list.add(0, "Andrei");
        list.add("Pavel");
        list.add("Lena");
        System.out.println(list.size());
        System.out.println(list);

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        for(String a: list) {
            System.out.print(a + " ");
        }
        System.out.println();
        for(int a =0; a<list.size(); a++) {
            System.out.print(list.get(a) + " ");
        }



    }
}
