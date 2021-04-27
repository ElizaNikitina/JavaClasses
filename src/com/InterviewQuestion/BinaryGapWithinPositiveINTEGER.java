package com.InterviewQuestion;

public class BinaryGapWithinPositiveINTEGER {
    public int solution(int N) {
        String binaryRep = Integer.toBinaryString(N);
        char[] nChars = binaryRep.toCharArray();
        int nElemLength = Math.min(binaryRep.lastIndexOf('1') + 1, nChars.length);
        if (nElemLength <= 2) {
            return 0;
        }
        String[] elementsParts = binaryRep.substring(0, nElemLength).split("1");
        int zeroLength = 0;
        for (String elementsPart : elementsParts) {
            if (elementsPart.length() > zeroLength) {
                zeroLength = elementsPart.length();
            }
        }
        return zeroLength;// write your code in Java SE 8
    }
}
