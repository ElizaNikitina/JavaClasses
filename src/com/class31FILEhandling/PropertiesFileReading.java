package com.class31FILEhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

    public static void main(String[] args) throws IOException {

        String filePath = "/Users/Eliza/Desktop/IntelllijIDEA/JavaClasses/src/configs/examples.properties";

        FileInputStream fileInput = new FileInputStream(filePath);

        Properties prop = new Properties();

        prop.load(fileInput);
        String name =  prop.getProperty("name");
        System.out.println(name);

        String city =  prop.getProperty("city");
        System.out.println(city);

        Set<Object> keys = prop.keySet();
        for(Object key:keys){
            System.out.println(key);
        }

       Collection<Object> values = prop.values();
        for(Object value:values){
            System.out.println(value);
        }

        Set<Map.Entry<Object, Object>> all = prop.entrySet();
        for (Map.Entry<Object, Object> one:all){
           String set =  one.getKey() + " " +  one.getValue();
            System.out.println(set);
        }

    }
}
