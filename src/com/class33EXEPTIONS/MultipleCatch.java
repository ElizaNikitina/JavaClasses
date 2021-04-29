package com.class33EXEPTIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {
    public static void main(String[] args) {
        String path="";
        try {
            FileInputStream fis = new FileInputStream(path); //FileNotFoundException
            Properties prop = new Properties();
            prop.load(fis); //IOException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
