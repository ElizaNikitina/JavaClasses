package com.class29SetAndMap.Class;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task01 {
    public static void main(String[] args) {

        Set<String> countries = new TreeSet<>();

        countries.add("Germany");
        countries.add("Poland");
        countries.add("England");
        countries.add("France");
        countries.add("Italy");

        System.out.println(countries);

        Iterator<String> iter = countries.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        for(String country:countries){
            System.out.print(country+ " ");
        }
    }
}
