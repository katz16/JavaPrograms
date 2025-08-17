package org.example.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Vikram");
        Student s2 = new Student(116, "Karthik");
        Student s3 = new Student(45, "Swaathi");
        Student s4 = new Student(101, "Vijay"); // Duplicate for testing equals and hashCode
        List<Student>list= new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list,new IdComparator());
        System.out.println("List sorted by ID: " + list);
        Collections.sort(list, new NameComparator());
        System.out.println("List sorted by Name: " + list);


    }
}
