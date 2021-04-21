package com.class31FILEhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
    public static void main(String[] args) throws IOException {
        //write into existing file and add value

        String filePath = "/Users/Eliza/Desktop/IntelllijIDEA/JavaClasses/src/configs/examples.properties";
        FileInputStream fis = new FileInputStream(filePath);

        Properties prop = new Properties();
        prop.load(fis);
        prop.setProperty("phoneNumber", "123456789");

        FileOutputStream fos = new FileOutputStream(filePath);
        prop.store(fos, "added phone number key and value");


    }
}
