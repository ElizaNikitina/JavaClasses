package com.InterviewQuestion;

public class FIXBug {
    int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p = -1;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < 1 + l; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        FIXBug f = new FIXBug();
        System.out.println( f.solution(100));

    }
}