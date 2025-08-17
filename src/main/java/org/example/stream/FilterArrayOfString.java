package org.example.stream;

import java.util.Arrays;

public class FilterArrayOfString {
    public static void main(String[] args) {
        String[]strArr={"Karthik", "Ravi", "Suresh", "Kumar", "Ramesh", "Rajesh", "Srinivas", "Vijay", "Ajay", "Anil"};
        //Filter the array of strings based on a starting letter K
        Arrays.stream(strArr).filter(s->s.startsWith("K")).forEach(System.out::println);
    }

    }

