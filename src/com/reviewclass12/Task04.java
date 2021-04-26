package com.reviewclass12;

import java.util.HashMap;
import java.util.Set;

public class Task04 {

    public static void main(String[] args) {

        HashMap<String,Integer> empMap = new HashMap<>();
        empMap.put("Eliza", 12000);
        empMap.put("Artem", 15000);
        empMap.put("Oleg", 10000);
        empMap.put("Maksim", 17000);
        empMap.put("Andrei", 17000);
        empMap.put("Yula", 13000);

        Set<String> empKey = empMap.keySet();
        Integer maxSalary = Integer.MIN_VALUE;
        String maxSalaryKey = "";
        for(String key:empKey){
            if(empMap.get(key)>maxSalary){
                maxSalary=empMap.get(key);
                maxSalaryKey = key;
            }
        }

        System.out.println(maxSalaryKey + " earns the Max salary " + empMap.get(maxSalaryKey));
    }
}
