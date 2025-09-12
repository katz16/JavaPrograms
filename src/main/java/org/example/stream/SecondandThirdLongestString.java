package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondandThirdLongestString {
    public static void main(String[] args) {
        String[]str={"Karthik", "Kumar", "Mohandas", "Raguram"};

        String[] sorted = Arrays.stream(str)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toArray(String[]::new);

        if (sorted.length >= 3) {
            System.out.println("Second longest: " + sorted[1]);
            System.out.println("Third longest: " + sorted[2]);
        } else {
            System.out.println("Array does not have enough elements.");
        }

    }
}
