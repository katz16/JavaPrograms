package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class FinalList {
    public static void main(String[] args) {
        // Demonstrating the use of final with a list
        final List<String>list= new ArrayList<String>();
        list.add("Pen");
        list.add("Pencil");
        System.out.println(list);
        //list= new ArrayList<String>(); // This line will cause a compilation error because 'list' is final
        //We can add or remove elements from the list, but we cannot reassign 'list' to a new list.
    }
}
