package com.class28LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        for(int a = 2; a<=50; a+=2) {
            num.add(a);
        }
        System.out.println(num);

        Iterator<Integer> x=num.iterator();
        while(x.hasNext()) {
            if(x.next()%5==0) {
                x.remove();
            }

        }
        System.out.print(num+ " ");
    }

}
