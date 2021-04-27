package com.InterviewQuestion;

import java.util.*;

public class ImproveArray {
    int solution(int[] A) {

        Set<Integer> arr = new HashSet<>(A.length);
       int N = arr.size();
       for(int b:A){
           arr.add(Integer.valueOf(b));
       }
        int result = 0;
        Iterator<Integer> iter = arr.iterator();
       while(iter.hasNext()){
          int a = iter.next();
          result = Math.max(result, a);
       }
       // int N = A.length;
//        int result = 0;
//        for (int i = 0; i < N; i++)
//            for (int j = i; j < N; j++)
//                if (arr.)
//                    result = Math.max(result, j - i);
        return result;
    }

    public static void main(String[] args) {
        ImproveArray arr = new ImproveArray();
        arr.solution( new int[100]);
    }


}
/*
 int N = A.length;
        int result = 0;
        for (int i = 0; i < N; i++)
            for (int j = i; j < N; j++)
                if (A[i]!=A[j])
                    result = Math.max(result, j - i);
        return result;
 */