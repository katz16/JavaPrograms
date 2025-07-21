package org.example;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
