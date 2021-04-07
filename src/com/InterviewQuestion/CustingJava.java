package com.InterviewQuestion;

import java.util.stream.Stream;

public class CustingJava {

    public static void main(String[] args) {

        Stream <String> stream = Stream.of("A", "B", "C", "D");
        System.out.println(stream.peek(System.out::print).findAny().orElse("NA"));
    }

}
