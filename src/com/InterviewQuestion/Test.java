package com.InterviewQuestion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {



        int[] A = {4,6,2,2,6,6,4};
        System.out.println(method(A));
        System.out.println(method2(A));
        //System.out.println(result);
    }

    public static int method(int[] A){
        //int[] A = {4,6,2,2,6,6,4};
        int N = A.length;
        System.out.println("length "+N);
        int result = 0;
        for (int i = 0; i < N; i++)
            for (int j = i; j < N; j++)
                if (A[i]!=A[j])
                    result = Math.max(result, j - i);

                return result;
    }

    public static  int method2(int[] B){
        List<Integer> array = new ArrayList<>(B.length);
       for(int k:B){
           array.add(k);
       }
       int res = 0;
       int l = array.size();
        System.out.println("array size " + l);
       for(int i=0; i<l; i++){
           for(int j=i; j<l; j++){
               if(!array.get(i).equals(array.get(j))){
                   res = Math.max(res, j-i);
               }
           }
       }

       return res;
    }

}
