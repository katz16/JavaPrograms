package org.example;

import java.util.ArrayList;
import java.util.List;

public class OddOrEven {
    public static void main(String[] args) {
        List<Integer>list= List.of(71, 18, 42, 21, 67, 32);
        List<Integer>odd= new ArrayList<Integer>();
        List<Integer>even= new ArrayList<Integer>();
        list.stream().filter(l->l%2==0?even.add(l):odd.add(l)).toList();
        System.out.println(list);
        System.out.println(odd);
        System.out.println(even);
    }
}
