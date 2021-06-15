package com.practiceInterview;

public class ReverseBufferClass {

    public static void main(String[] args) {

        String a  = "Hello word";
        StringBuffer buffer = new StringBuffer(a);
        System.out.println(buffer.reverse());
    }
}
