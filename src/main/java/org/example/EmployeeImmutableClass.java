package org.example;

import java.util.*;
import java.util.stream.Collectors;

//mark the class as final to prevent inheritance
public final class EmployeeImmutableClass {
    //mark all attributes as private and final
    private final String name;
    private final Date doj;
    private final List<String> phoneno;

    public EmployeeImmutableClass(String name, Date doj, List<String> phoneno) {
        this.name = name;
        this.doj = doj;
        this.phoneno = phoneno;
    }
    //No setters are provided to maintain immutability

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) doj.clone();//Date is a mutable class, so we return a clone to maintain immutability
    }

    public List<String> getPhoneno() {
        return Collections.unmodifiableList(phoneno); // Return an unmodifiable view of the list to prevent modification
    }

    @Override
    public String toString() {
        return "EmployeeImmutableClass{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", phoneno=" + phoneno +
                '}';
    }

    public static void main(String[] args) {
        EmployeeImmutableClass e= new EmployeeImmutableClass("John Doe", new Date(), Arrays.stream(new String[]{"123","234"}).collect(Collectors.toList()));
        e.getDoj().setDate(15);// This will not change the original date in the EmployeeImmutableClass

        System.out.println(e);
    }
}
