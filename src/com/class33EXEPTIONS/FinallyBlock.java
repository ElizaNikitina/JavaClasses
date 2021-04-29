package com.class33EXEPTIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FinallyBlock {
    public static void main(String[] args) {
        String path = "";

        try {
            FileInputStream fis = new FileInputStream(path); //FileNotFoundException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("I am finally block");
        }
    }
}
