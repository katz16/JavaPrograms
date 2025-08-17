package org.example;

import java.util.Arrays;
import java.util.Date;

//mark the class as final to prevent inheritance
public final class EmployeeImmutableClass {
    //mark all attributes as private and final
    private final String name;
    private final Date doj;
    private final long[]phoneno;

    public EmployeeImmutableClass(String name, Date doj, long[] phoneno) {
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

    public long[] getPhoneno() {
        return phoneno;
    }

    @Override
    public String toString() {
        return "EmployeeImmutableClass{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", phoneno=" + Arrays.toString(phoneno) +
                '}';
    }

    public static void main(String[] args) {
        EmployeeImmutableClass e= new EmployeeImmutableClass("John Doe", new Date(), new long[]{1234567890, 9876});
        e.getDoj().setDate(15);// This will not change the original date in the EmployeeImmutableClass
        System.out.println(e);
    }
}
