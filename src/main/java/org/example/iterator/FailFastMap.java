package org.example.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("A", 1);
        map.put("B", 2);
        Iterator<String> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String key= iterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
            map.put("C", 3); // This will cause a ConcurrentModificationException
            // because we are modifying the map while iterating over it.
        }
    }
}
