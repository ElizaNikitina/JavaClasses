package com.practiceInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("World");
        list.add("World");

        HashSet<String> newSet = new HashSet<>(list);

        for(String n:newSet){
            System.out.println(n);
        }
    }
}
