package org.example.string;

public class StringTester {
    public static void main(String[] args) {
        //How many ways we can create a String Object?
        // 1. String literal
        //String str1 = "Hello";
        // 2. Using new keyword
        //String str2 = new String("Hello");

        //When we create a String using literal, one object will be created in SCP and the same will be referred.
        String s1="Hello";
        String s2="Hello";
        String s3="Hello";
        System.out.println(s1 == s2);
        System.out.println(s2== s3);
        System.out.println(s1 == s3);

        String n1 = new String("Hello");
        String n2 = new String("Hello");
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println(s1 == n1);


    }
}
