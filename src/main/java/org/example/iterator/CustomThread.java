package org.example.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread{
   // static Map<String,Integer>map=new HashMap<String,Integer>();//using HashMap will cause ConcurrentModificationException
    // Using ConcurrentHashMap to avoid ConcurrentModificationException
   static Map<String,Integer>map=new ConcurrentHashMap<String,Integer>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            map.put("D",4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        Thread t1=new CustomThread();
        t1.start();
        Iterator<String> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
