package org.example.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String>list=List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println("List with duplicates "+list);
        List<String>listWithoutDuplicates=list.stream().distinct().toList();
        System.out.println("List without duplicates "+listWithoutDuplicates);

        System.out.println("Another way to remove duplicates");
        Set<String>set=new HashSet<String>();
        /*for(String i:list){
            set.add(i);

        }
        System.out.println(set);*/
        list.stream().forEachOrdered(l->set.add(l));
        System.out.println(set);
    }
}
