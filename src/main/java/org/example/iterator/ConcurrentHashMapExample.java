package org.example.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map=new ConcurrentHashMap<String,Integer>();
        map.put("A", 1);
        map.put("B", 2);
        Iterator<String> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String key= iterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
            map.put("C", 3); // Adding a new entry while iterating
            // This is safe in ConcurrentHashMap, but not in a regular HashMap
        }
    }
}
