package com.reviewclass7.variables;

public class VarDemoTester {


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        VarDemo varDemo = new VarDemo(arr);
        varDemo.calculateAverage();
        varDemo.printMax();
        varDemo.printMin();
        varDemo.sort2DArray();
    }
}
