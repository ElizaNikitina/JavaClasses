package com.InterviewQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromArrayList {

    public static void removeDuplicateFromList(List<String> list){

        HashSet<String> newSet = new HashSet<>(list);

        for(String n:newSet){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("World");
        list.add("World");
        removeDuplicateFromList(list);
    }
}
