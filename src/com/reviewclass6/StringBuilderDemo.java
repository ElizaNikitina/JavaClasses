package com.reviewclass6;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Hello");
       // stringBuilder.append(" Batch 9").delete(0,5);
       // stringBuilder.append(" Batch 9").deleteCharAt(0);
       // stringBuilder.append(" Batch 9").insert(stringBuilder.length()+1,"Bye");
        stringBuilder.append(" asjkdbfbds you sdfksdbgkjsbg");
        stringBuilder.insert(stringBuilder.indexOf("you")+4,"bye ");
        System.out.println(stringBuilder.indexOf("you"));


        StringBuilder sb=new StringBuilder("Hello ");
        sb.insert(1,"Java");//now original string is changed.
        System.out.println(sb);//prints HJavaello

        System.out.println("dwonloding a file of size 30GB");
        System.out.println("extract the file ");



        System.out.println(stringBuilder);

        String string=new String("Hello");
        string=string.concat(" Batch 9");
        System.out.println(string);

        StringBuffer stringBuffer=new StringBuffer("I can work in paralllel");
        stringBuffer.reverse();
        stringBuffer.append("hi");


    }
}
