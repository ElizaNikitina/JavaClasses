package com.class33EXEPTIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Task01DifferentExceptionsIntoList {

    public static  List<Exception> getDifferentException(){

        List<Exception> exceptionList = new ArrayList<>();

        String path = "";
        try {
            FileInputStream fis = new FileInputStream(path);
        } catch (FileNotFoundException fne) {
            // fne.printStackTrace();
            System.out.println("Caught FileNotFoundException");
            exceptionList.add(fne);
        }

        try{
            int a = 42 / 0;
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException has been caught");
            exceptionList.add(ex);
        }

        try{
            String s = null;
            String m = s.toLowerCase();
        }catch(NullPointerException ne){
            System.out.println("NullPointerException has been caught");
            exceptionList.add(ne);
        }

//        try{
//            int[] m = new int[2];
//            m[8] = 5;
//        }catch(ArrayIndexOutOfBoundsException ae){
//            System.out.println("ArrayIndexOutOfBoundsException has been caught");
//            exceptionList.add(ae);
//        }
//
//        try{
//            ArrayList<String> list = new ArrayList<String>();
//            String s = list.get(18);
//        }catch(IndexOutOfBoundsException ae){
//            System.out.println("IndexOutOfBoundsException has been caught");
//            exceptionList.add(ae);
//        }

//        try{
//            HashMap<String, String> map = new HashMap<String, String>(null);
//            map.put(null, null);
//            map.remove(null);
//        }catch(NullPointerException se){
//            System.out.println("NullPointerException has been caught");
//            exceptionList.add(se);
//        }
//
//        try{
//            int num = Integer.parseInt("XYZ");
//            System.out.println(num);
//        }catch(NumberFormatException ne){
//            System.out.println("NumberFormatException has been caught");
//            exceptionList.add(ne);
//        }
        return exceptionList;
    }

    public static void main(String[] args) {
        List<Exception> list = getDifferentException();
        System.out.println(list.size());

        Iterator <Exception> iter = list.iterator();
        while (iter.hasNext()){
         String message =   iter.next().getMessage();
            System.out.println(message);
        }
    }
}
