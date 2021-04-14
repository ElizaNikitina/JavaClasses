package com.class29SetAndMap.HW;

abstract class Coverage{
    public void method(){
        System.out.println("Method coverage class");
    }
}
public abstract class Insurance extends Coverage{

    public String insuranceName;

    public Insurance(String insuranceName){
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();

}

class Car extends Insurance{
    int price;
    String carModel;
    public Car(String insuranceName, int price, String carModel) {
        super(insuranceName);
        this.price = price;
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        if(price<1000) {
            System.out.println("Your insurance price is " + (price*0.2));
        }else {
            System.out.println("Your insurance price is " + (price*0.5));
        }

    }


    @Override
    public void cancelInsurance() {
        System.out.println("Due to  other offers, " + insuranceName + "s offer for " + carModel + " is canceled");
    }
}

class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Offers are too high for " + petType + " from " + insuranceName + " insurance company");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Canceled due to high prices");
    }
}

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println(
                "Brown family got 1500$ offer from " + insuranceName + " insurance company fro family health packed");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Please contact customer service " + insuranceName + "s insurance company for cancelation");
    }
}
