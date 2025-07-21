package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MultiplesOf5 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("The values are ");
        list.stream().filter(l->l%5==0).forEach(l-> System.out.println(l));
    }



}
