package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String s="Java Concept Of The Day";
        String[] sarr=s.split(" ");
        List<String>list=List.of(sarr);
        List<StringBuilder>reversedList= new ArrayList<>();
        list.stream().map(word->new StringBuilder(word).reverse()).forEach(l->reversedList.add(l));
        System.out.println(reversedList);
    }
}
