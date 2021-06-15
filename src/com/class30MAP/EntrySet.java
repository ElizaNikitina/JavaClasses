package com.class30MAP;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

    public static void main(String[] args) {
        Map<String, String> land=new TreeMap<>();
        land.put("Togo", "Lome");
        land.put("Jamaica", "Kingston");
        land.put("Iran", "Tehran");
        land.put("Peru", "Lima");
        land.put("Cuba", "Havana");
        System.out.println(land);

        Set<Map.Entry<String, String>> allEntries = land.entrySet();
        System.out.println(allEntries);

        for(Map.Entry<String, String> oneEntry:allEntries){
            String key = oneEntry.getKey();
            String value = oneEntry.getValue();
            System.out.println(key + "---"+ value);
        }

        System.out.println("---Get all key and Values using Iterator----");
     Iterator<Map.Entry<String, String>> iter = allEntries.iterator();
        while (iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key " + key + " : " + "Value " + value);
        }

    }
}
