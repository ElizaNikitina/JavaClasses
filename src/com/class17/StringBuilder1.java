package com.class17;

  public class StringBuilder1 {


    public static void main(String[] args) {


    /*
    no object will be scan from the memory and always new object will be create inside memory
     */

        String var1 = "Merim";
        StringBuilder sb1 = new StringBuilder(var1);
        sb1.reverse();

        var1 = sb1.toString();
        System.out.println(var1);


    }
}
