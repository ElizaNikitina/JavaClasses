package com.reviewclass12;

import java.util.ArrayList;
import java.util.List;

public class Task06 {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);
        obj.add(1);

        int sum=0;

        for(Integer i:obj){
            sum+=i;
        }
        System.out.println(sum);
    }
}
