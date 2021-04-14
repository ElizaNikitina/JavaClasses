package com.class29SetAndMap.HW;

import java.util.Iterator;
import java.util.LinkedList;

public class TestInsurance {

    public static void main(String[] args) {

        //Insurance car = new Car();

        LinkedList<Insurance> obj = new LinkedList<>();
        obj.add(new Car("Fidelity", 200, "tesla"));
        obj.add(new Pet("Mutrl Ins", "cat"));
        obj.add(new Health("Fidelis"));

        System.out.println(obj.size());

        Iterator<Insurance> iter = obj.iterator();
        while (iter.hasNext()){
            Insurance obj1 = iter.next();
            obj1.cancelInsurance();
            obj1.getQuote();
            obj1.method();


           // iter.next().getQuote();
            System.out.println("------");
        }

    }
}
