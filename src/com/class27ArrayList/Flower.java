package com.class27ArrayList;

public abstract class Flower {

    public String type;

    public Flower(String type) {
        this.type = type;
    }

    public abstract void bloom();

}

class Tulip extends Flower {

    public Tulip(String type) {
        super(type);
    }

    @Override
    public void bloom() {
        System.out.println(type + " blooms in March");
    }
}

class Rose extends Flower {
    public Rose(String type) {
        super(type);
    }

    @Override
    public void bloom() {
        System.out.println(type + " blooms in June");
    }
}

class SunFlower extends Flower {
    public SunFlower(String type) {
        super(type);
    }

    @Override
    public void bloom() {
        System.out.println(type + " blooms in August");
    }

}
