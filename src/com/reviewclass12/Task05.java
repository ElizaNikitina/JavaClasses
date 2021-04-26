package com.reviewclass12;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task05 {
    public static void main(String[] args) {
        Set<String> objs = new LinkedHashSet<>();

        objs.add("Eliza");
        objs.add("Artem");
        objs.add("Oleg");
        objs.add("Lena");
        objs.add("Gulham");

        StringBuilder var = new StringBuilder();

        for (String obj : objs){
            var.append(obj);
        }

        System.out.println(var);
    }
}
