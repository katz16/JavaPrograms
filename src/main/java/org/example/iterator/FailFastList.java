package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Pen");
        list.add("Eraser");
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String item= iterator.next();
            System.out.println(item);
            list.add("Pencil"); // This will cause ConcurrentModificationException
        }
    }
}
