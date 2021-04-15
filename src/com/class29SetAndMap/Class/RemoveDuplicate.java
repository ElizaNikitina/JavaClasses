package com.class29SetAndMap.Class;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("Alice");
        aList.add("Alice");
        aList.add("John");
        aList.add("John");
        aList.add("Eliza");
        aList.add("Eliza");

        System.out.println(aList);

        Set<String> set = new TreeSet<>();
        set.addAll(aList);
        set.add("Noone");
        set.add("Asel");
        System.out.println(set);

        if(set.contains("Asel")){
            System.out.println("We have Asel");
        }

      List<String> list = new ArrayList<>(set);
       String name =  list.get(4);
        System.out.println(name);

      Object[] array =  set.toArray();
        System.out.println(array[4]);
        Arrays.sort(array);


        //to sort elements of any collection
        Collections.sort(list);
        System.out.println(list);
    }
}
