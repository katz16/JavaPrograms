package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        List<Integer>list= List.of(45, 12, 56, 15, 24, 75, 31, 89);
        Integer min=list.stream().min(Comparator.comparing(s->s)).get();
        Integer max=list.stream().max(Comparator.comparing(Function.identity())).get();
        System.out.println("Minimum value is "+min);
        System.out.println("Maximum value is "+max);
    }
}
