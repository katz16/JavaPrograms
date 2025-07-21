package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int val=15623;
        String s= String.valueOf(val);
        char[]c=s.toCharArray();
        int sum=0;
        for(char ch:c){
            sum=sum+Integer.parseInt(String.valueOf(ch));
        }
        System.out.println("sum of the digits is "+sum);
    }
}
