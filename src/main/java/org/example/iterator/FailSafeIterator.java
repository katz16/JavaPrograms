package org.example.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
    public static void main(String[] args) {
        List<String> list=new CopyOnWriteArrayList<String>();
        list.add("Pen");
        list.add("Pencil");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String item=iterator.next();
            System.out.println(item);
            list.add("Eraser"); // Adding an item while iterating
            // This will not throw ConcurrentModificationException
        }
    }
}
