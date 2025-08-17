package org.example.compare;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable interface is used to define the natural ordering of objects.
//this is a single sorting mechanism.
//It is used to sort the objects of a class based on a single field.
public class StudentComparable implements Comparable<StudentComparable>{
    private int id;
    private String name;

    public StudentComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(StudentComparable s) {
        if(this.id == s.id)
            return 0;
        else if(this.id > s.id)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<StudentComparable>list =new ArrayList<StudentComparable>();
        list.add(new StudentComparable(50, "John"));
        list.add(new StudentComparable(25, "Alice"));
        list.add(new StudentComparable(3, "Bob"));
        System.out.println("List before sorting: " + list);
        Collections.sort(list);
        System.out.println("List after sorting: " + list);
        // Output will be sorted based on id in ascending order
    }
}