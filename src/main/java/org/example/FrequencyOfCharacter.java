package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String inputString= "Java Concept Of The Day";
        IntStream inputStream= inputString.chars();
        Map<Character,Long>map=inputStream.mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
