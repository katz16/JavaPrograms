package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min3AndMax3 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer>min3=list.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        List<Integer>max3=list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("the minimum 3 elements are "+min3);
        System.out.println("the maximum 3 elements are "+max3);
    }
}
