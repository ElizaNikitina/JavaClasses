package com.class29SetAndMap.Class;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task02 {

    public static void main(String[] args) {

        Set<String> cities = new LinkedHashSet<>();
        cities.add("Atlanta");
        cities.add("Afinne");
        cities.add("New York");
        cities.add("Miami");
        cities.add("ST Pete");
        cities.add("Los Angles");

        System.out.println(cities);


        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()){

            if(iter.next().startsWith("A")){
                iter.remove();
            }

        }

        System.out.println(cities);
    }
}
