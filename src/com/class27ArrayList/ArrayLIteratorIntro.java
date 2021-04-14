package com.class27ArrayList;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListIteratorIntro {
    public static void main(String[] args) {

        ArrayList<String> choco = new ArrayList<>();
        choco.add("Milka");
        choco.add("kinder");
        choco.add("Twix");
        choco.add("Snikers");


        ArrayList<String> sweets = new ArrayList<>();
        sweets.add("Ice cream");
        sweets.add("Cheese cake");
        sweets.addAll(choco);

        System.out.println(sweets.size());

        Iterator<String> iter = sweets.iterator();
        while (iter.hasNext()){
           String s = iter.next();
            System.out.print( s + " ");
        }

        System.out.println("");
        for (int i = sweets.size()-1; i>=0; i--){
            System.out.print(sweets.get(i) + " ");
        }

    }
}
