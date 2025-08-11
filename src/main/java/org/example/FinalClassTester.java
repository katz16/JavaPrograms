package org.example;

import org.example.model.Address;
import org.example.model.Student;

public class FinalClassTester {
    public static void main(String[] args) {
        Student s = new Student(1, "John Doe", new Address("New York", "NY", "10001"));
        System.out.println("---  Student Details---");

        System.out.println(s);


    }
}
