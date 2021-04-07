package com.reviewclass7.methods;


//import com.sun.istack.internal.NotNull;

public class MethodDemo3 {

//    /***
//     *
//     * @param name should not be null
//     */
//    void methodDemo( @NotNull String name){
//
//        System.out.println(name.length());
//    }

    int sumTheOdds(int [] arr){

        int sum=0;
        for (int num:arr
             ) {
            if(num%2!=0){
                sum+=sum+num;
            }
        }
        return sum;
    }
}
