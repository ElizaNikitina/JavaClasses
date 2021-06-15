package com.practiceInterview;

import java.util.Arrays;

public class FindSecondMaxInArray {
    public static void main(String[] args) {

        int[] arr = { 999, 90, 1, 2, -3, 4, 5, 6, 7, 99 };

        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 2; i < arr.length; i++){
            if (arr[i] > max2)
            {
                max2 = arr[i];
            }

            if (max2 > max1)
            {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }

        System.out.println("Second max number " + max2);


        int[] array = { 999, 90, 1, 2, -3, 4, 5, 6, 7, 99 };

        Arrays.sort(array);
        int c = array[array.length-2];
        System.out.println("First method: second max " + c);
        int d = array[array.length-3];
        System.out.println("First method: 3d max " + d);
    }
}
