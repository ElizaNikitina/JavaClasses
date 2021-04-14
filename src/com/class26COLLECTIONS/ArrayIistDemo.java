package com.class26COLLECTIONS;

import java.util.ArrayList;

public class ArrayIistDemo {

    public static void main(String[] args) {

      ArrayList <String> arrayList =  new ArrayList<>();
        arrayList.add("ELiza");
        arrayList.add("Artem");
        arrayList.add("Nikita");

        String secondElem = arrayList.get(1);
        String firstElem = arrayList.get(0);
        System.out.println(secondElem);
        System.out.println(firstElem);

        arrayList.add("James");
        System.out.println(arrayList);

       int size = arrayList.size();
        System.out.println(size);

        arrayList.remove(3);

        size = arrayList.size();
        System.out.println(size);

        System.out.println(arrayList);

        arrayList.set(0, "Gulbahar");
        System.out.println(arrayList);

        for(String name:arrayList){
            System.out.println(name);
        }
        System.out.println("========");
        for(int i=0; i<arrayList.size(); i++) {
            String element=arrayList.get(i);
            System.out.println(element);
        }
    }
}
