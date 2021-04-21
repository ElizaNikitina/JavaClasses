package com.class30MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BestBy {

    public static void main(String[] args) {

        Map<Integer, String> bestBy = new LinkedHashMap<>() ;
        bestBy.put(1234, "Printer");
        bestBy.put(1235, "TV");
        bestBy.put(1236, "Laptop");
        bestBy.put(1237, "Phone");
        bestBy.put(1238, "Head Phone");

        Set<Map.Entry<Integer,String>> items= bestBy.entrySet();

        Iterator<Map.Entry<Integer,String>> item=items.iterator();
        while (item.hasNext()){
            Map.Entry<Integer,String> i = item.next();
           String it =  i.getKey()+ ":::"+i.getValue();
            System.out.println(it);
        }

        for(Map.Entry<Integer, String> i:items){
            String it = i.getKey() + " " + i.getValue();
            System.out.println(it);
        }

    }
}
