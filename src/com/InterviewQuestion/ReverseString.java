package com.InterviewQuestion;

public class ReverseString {

    public String toReverse(String old){ //charAt
        String reverse = "";

        for(int i=old.length()-1; i>=0; i--){
            reverse+=old.charAt(i);
        }
        return reverse;
    }

    public String toReverseWithCharArray(String old){
        String reverse = "";
        char[] array = old.toCharArray();
        for(int i=array.length-1; i>=0; i--){
            reverse+=array[i];
        }
        return reverse;
    }

    public String toReverseWithStringArray(String old){
        String reverse = "";
        String[] array = old.split("");
        for(int i=old.length()-1; i>=0; i--){
            reverse+=array[i];
        }
        return reverse;
    }

    public void toReverseWordNyWord(String old) {

        String[] array = old.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length() - 1; j >= 0; j--) {
                System.out.print(array[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    public String invertWithStringBuffer(String old) {

        StringBuffer buffer = new StringBuffer(old);
        buffer.reverse();
        return buffer.toString();
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();


        System.out.println(obj.toReverse("Greatest Of All Time"));
        System.out.println(obj.toReverseWithCharArray("Greatest Of All Time"));
        System.out.println(obj.toReverseWithStringArray("Greatest Of All Time"));
      obj.toReverseWordNyWord("Greatest Of All Time");
        System.out.println("");
        System.out.println(obj.invertWithStringBuffer("Greatest Of All Time"));


    }
}
