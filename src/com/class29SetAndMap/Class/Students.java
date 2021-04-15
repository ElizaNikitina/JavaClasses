package com.class29SetAndMap.Class;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Students {
    String name;
    int studentID;

    Students(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }

    public String getName(){
        return name;
    }
}

class Test{
    public static void main(String[] args) {

        Set<Students> students = new LinkedHashSet<>();
        students.add(new Students("Eliza", 123));
        students.add(new Students("Artem", 124));
        students.add(new Students("Oleg", 125));
        students.add(new Students("Andrei", 126));
        students.add(new Students("Oles", 127));

        Iterator<Students> iter = students.iterator();
        while (iter.hasNext()){
         String name =  iter.next().getName();
            System.out.print(name + " ");
        }

    }
}
