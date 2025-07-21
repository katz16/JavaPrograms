package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingBasedOnStringLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        System.out.println("List before sorting: " + listOfStrings);
        List<String>sortedList=listOfStrings.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("List after sorting: " + sortedList);

        //Another way to sort based on string length
        listOfStrings.stream().sorted((s1,s2)->Integer.compare(s1.length(), s2.length()))
                .forEach(System.out::println);

    }
}
