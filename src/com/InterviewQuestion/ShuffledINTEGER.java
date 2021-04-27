package com.InterviewQuestion;

public class ShuffledINTEGER {
    public int solution(int num) {

    String str = String.valueOf(num);
    if(str.length()<=1)

    {
        return num;
    }

    char[] firstHalf = str.substring(0, str.length() / 2).toCharArray();
    char[] secondHalf = new StringBuilder(str.substring(str.length() / 2)).reverse().toString().toCharArray();
    StringBuilder finalStr = new StringBuilder();
    for(
    int i = 0;
    i<firstHalf.length;i++)

    {
        finalStr.append(firstHalf[i]);
        finalStr.append(secondHalf[i]);
    }
    // To handle for odd numbers length of array
    if(secondHalf.length >firstHalf.length)

    {
        finalStr.append(secondHalf[secondHalf.length - 1]);
    }

    return Integer.parseInt(finalStr.toString());
}
}
