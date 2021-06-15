package com.class34FinallyBlock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {
    public static void main(String[] args) {
        division(10, 5);
        division(10, 0);
    }

    public static  int division(int a, int b){

        int result = 0;
        try{
            result = a/b;
            System.out.println(result);
        }catch (ArithmeticException ex){
//            ex.printStackTrace();
//            System.out.println(ex.getMessage());
            System.out.println(ex);
//            System.out.println("ArithmeticException has been caught");
        }finally {
            System.out.println("I am a finally block");
        }

        return result;
    }

    public static void read(String filePath){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
            Properties prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null) {
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
