package org.example.collection;

import java.util.HashSet;
import java.util.Set;

public class SetBasics {
    //Set only adds unique elements.
    //But this can be broken by using identitical objects with different references.
    //To add unique elements for custom objects, we need to override equals() and hashCode() methods.
    public static void main(String[] args) {
        Set<Student> set=new HashSet<Student>();
        Student s1=new Student(1, "John Doe");
        Student s2=new Student(1, "John Doe");
        Student s3=new Student(2, "Michael");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
