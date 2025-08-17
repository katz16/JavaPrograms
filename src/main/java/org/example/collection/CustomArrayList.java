package org.example.collection;

import java.util.ArrayList;
import java.util.List;

// this is a custom array list implementation that doesnnot allow duplicate elements
public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return false; // if the element already exists, do not add it
        }
        else
            return super.add(o);
    }

    public static void main(String[] args) {
        List list= new CustomArrayList();
        list.add("Java");
        list.add("Python");
        list.add("Java"); // this will not be added
        System.out.println(list);
    }
}

