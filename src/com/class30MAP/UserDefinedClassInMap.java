package com.class30MAP;


import java.util.*;

abstract class Store{
    String name, type;

    Store(String name, String type){
        this.name=name;
        this.type=type;
    }
    public void dispay(){
        System.out.println("This is store "+ name);
    }
    public abstract void workingHour();
}

class Nike extends Store{
    Nike(String name, String type){
        super(name, type);
    }

    @Override
    public void workingHour() {
        System.out.println(name + " works from 10 am till 6 pm");
    }
}

class Cotsco extends Store{

    Cotsco(String name, String type) {
        super(name, type);
    }

    @Override
    public void workingHour() {
        System.out.println(name + " works from 8 am till 8 pm");
    }
}
class Amazon extends  Store{

    Amazon(String name, String type) {
        super(name, type);
    }

    @Override
    public void workingHour() {
        System.out.println(name + " works 24 hours");
    }
}

public class UserDefinedClassInMap {

    public static void main(String[] args) {

        Map<Integer, Store> storeMap  = new LinkedHashMap<>();
        storeMap.put(1, new Amazon("Amazon", "Internet store"));
        storeMap.put(2, new Cotsco("Costco", "wholesale"));
        storeMap.put(3, new Nike("Nike", "discount"));

        // to get an access to all methods of our Store Objects: .values(),  entrySet(), keySet(),

        //1. way --> get all Value Objects
        System.out.println("---------Using COLLECTION-----------");
        Collection<Store> store = storeMap.values();
        for(Store s:store){
           s.dispay();
           s.workingHour();
            System.out.println("======");
        }
        System.out.println("======USING ITERATOR=======");
        Iterator<Store> s = store.iterator();
        while (s.hasNext()){
          Store obj =  s.next();
          obj.workingHour();
          obj.dispay();
        }

        //2. way --> get all Entry Objects --> getValue
        System.out.println("---------USING ENTRY SET---------");
        Set<Map.Entry<Integer, Store>> storeSet = storeMap.entrySet();
        for(Map.Entry<Integer, Store> entry: storeSet) {
            entry.getValue().workingHour();
            entry.getValue().dispay();
            System.out.println("-----------------------------");
        }

        System.out.println("======USING ITERATOR===========");
       Iterator<Map.Entry<Integer, Store>> iter =  storeSet.iterator();
       while (iter.hasNext()){
           Map.Entry<Integer, Store> sto = iter.next();
           sto.getValue().workingHour();
           sto.getValue().dispay();
       }

        //3 .way --> get all Keys --> get value of specified key

        System.out.println("--------USING SET---------");
      Set<Integer> storeKeySet =  storeMap.keySet();
        for(Integer st:storeKeySet){
            Store obj=storeMap.get(st);
            obj.dispay();
            obj.workingHour();
            System.out.println("-----------------------------");
        }

        System.out.println("======USING ITERATOR===========");
      Iterator<Integer> storeKey =   storeKeySet.iterator();
        while (storeKey.hasNext()){
          Integer sto= storeKey.next();

        }
    }
}
