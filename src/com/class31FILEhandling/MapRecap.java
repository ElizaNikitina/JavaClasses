package com.class31FILEhandling;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MapRecap {

    public static void main(String[] args) {
        Map<String,String> hmap = new HashMap<>();
        hmap.put("Usa", "Washington DC");
        hmap.put("Russia", "Moscow");
        hmap.put("France", "Paris");
        hmap.put("Italy", null);
        hmap.put(null, "some value");

        //How get all keys from map? .keySet(); and .entrySet();

        Set<String> keys = hmap.keySet();
        for (String key:keys){
            System.out.print(key + " ");
        }

        System.out.println();

        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()){
            System.out.print( iter.next() + " ");
        }

        System.out.println();

        Set<Map.Entry<String, String>> entries = hmap.entrySet();
        Iterator <Map.Entry<String, String>> itera = entries.iterator();
        while (itera.hasNext()){
         // String key =  itera.next().getKey();
          //  System.out.print(key + " ");

            Map.Entry<String, String  > entry = itera.next();
          String myEntry =  entry.getKey() + "---" + entry.getValue();
            System.out.println(myEntry);
        }

        System.out.println();
        System.out.println("=====================");

        Collection<String> values = hmap.values();
        iter = values.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+ " ");
        }

        System.out.println();
        System.out.println("=====================");

        System.out.println(hmap);

        Map<String,String> htable = new Hashtable<>();
        htable.put("Usa", "Washington DC");
        htable.put("Russia", "Moscow");
        htable.put("France", "Paris");
       // htable.put("Italy", null); //HASHTABLE does not allow null value for "Value"
       // htable.put(null, "some value"); //HASHTABLE does not allow null value for "Key"


        System.out.println(htable);

        createMap("City", "Chantilly");

        createMap("City", "Washington DC");

    }


    public static Map<String, String> createMap(String key, String value) {
        Map <String, String> map = new HashMap<>();

        map.put(key, value);
        return map;
    }



}
