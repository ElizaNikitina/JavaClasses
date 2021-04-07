package com.reviewclass6;

public class AdvertisemenProg {
    public static void main(String[] args) {
        calculatePrice("123456 Wave Villas",3,4);
    }
    public static void calculatePrice(String input,double width,double height){
        int numberOfDays=input.substring(7).length();
        double tax=0.5;
        double areaFee=width*height;
        double advertisingFee=areaFee+numberOfDays*tax;
        System.out.println((int)advertisingFee);

    }
}
