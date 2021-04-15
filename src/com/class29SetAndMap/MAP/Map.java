package com.class29SetAndMap.MAP;

import java.util.HashMap;

public class Map<I extends Number, S> {
    public static void main(String[] args) {

    HashMap<String, String>  map = new HashMap<>();
    map.put("Name", "Eliza");
        map.put("Last Name", "Nikitina");
        map.put("Address", "123 Street");
        map.put("City", "New York");

        boolean isEmpty = map.isEmpty();
        System.out.println("Map is empty = "+isEmpty);

        int size = map.size();
        System.out.println("Map size is = " + size);

        map.put("Zip", "12345");
        //map.put("Name", "Artem");
        System.out.println(map);

        System.out.println(map.get("Name"));
        map.remove("Address");

        System.out.println(map);
        map.replace("Zip", "11210");

        System.out.println(map);

    }
}
