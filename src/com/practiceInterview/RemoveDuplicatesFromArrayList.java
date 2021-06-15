package com.practiceInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {

    public static void main(String args[]) {
        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer i : list){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }

        System.out.println("ArrayList with duplicates removed: " + newList);

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("e", "e", "boo", "boo","a", "b", "b"));
        System.out.println("ArrayList with duplicates: " + strList);

        ArrayList<String> newStrList = new ArrayList<>();
        for(String s:strList){
            if(!newStrList.contains(s)){
                newStrList.add(s);
            }
        }
        System.out.println("ArrayList with duplicates removed: " + newStrList);

        List<String> list1 = new ArrayList<>(Arrays.asList("Hello", "Hello", "Hello", "World", "World"));
//        list.add("Hello");
//        list.add("Hello");
//        list.add("World");
//        list.add("World");
//        list.add("World");
        HashSet<String> newSet = new HashSet<>(list1);
        for(String n:newSet){
            System.out.println(n);
        }
    }
}
