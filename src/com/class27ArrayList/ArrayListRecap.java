package com.class27ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

    public static void main(String[] args) {

        //generic collection specify type of collection
        ArrayList<Double> array = new ArrayList<>();
        array.add(10.99);
        array.add(2.99);
        array.add(5.6);

        System.out.println(array.size());
        System.out.println(array.isEmpty());

        array.add(3, 4.99);
        array.set(1, 10.98);
        System.out.println(array);

        array.remove(0);
        System.out.println(array);

        System.out.println(array.get(1));

        for(Double a:array){
            System.out.print(a + " ");
        }

        for (int i=0; i<array.size(); i++){
            double d = array.get(i);
            System.out.print(d);
        }

        //Iterator

        Iterator <Double> iter = array.iterator();
        while(iter.hasNext()) {
            double d=iter.next();
            System.out.println(d);
        }

        System.out.println("-------Non generic collection--------");

        System.out.println();
        System.out.println("==========");
        //non generic collection/arrayList
        ArrayList obj = new ArrayList();
        obj.add("hello");//store single object
        obj.add(1);
        obj.add('c');
        obj.addAll(array); //store collection of object

        System.out.println(obj);

        for(Object b:obj){
            System.out.print(b + " ");
        }

    }
}
