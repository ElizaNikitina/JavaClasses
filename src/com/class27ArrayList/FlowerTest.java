package com.class27ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
    public static void main(String[] args) {


    Flower[] flowerArray = {new Tulip("Tulip"), new Rose("Rose"), new SunFlower("Sun Flower")};

    //store flowers into array

    ArrayList<Flower> flowers = new ArrayList();

		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new SunFlower("Sun Flower"));


    Iterator<Flower> f=flowers.iterator();
		while(f.hasNext()) {
        Flower str = f.next();
        str.bloom();
            System.out.print(str + " ");
    }

		for(Flower x:flowers) {
        System.out.println(x.type);
        x.bloom();
    }

		for(int a =0; a<flowers.size(); a++) {
        Flower str = flowers.get(a);
        str.bloom();
           // System.out.print(str +" ");
    }

}
}
