package org.example.string;

public class StringImmutabilityTester {
    public static void main(String[] args) {
        String s= "Hello";
        System.out.println("Original String: " + s);
        s.concat(" World");
        System.out.println("Modified String: " + s);
        System.out.println(s.hashCode());
        // The output will show that the original string remains unchanged
        // because strings in Java are immutable.
        // The concat method does not modify the original string but returns a new one.
        // To see the effect of concat, we need to assign it back to s.
        s = s.concat(" World");
        System.out.println("After concat: " + s);
        System.out.println(s.hashCode());
        //the hash code is also different now.
    }
}
