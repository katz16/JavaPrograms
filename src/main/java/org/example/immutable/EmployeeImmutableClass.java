package org.example.immutable;

import java.util.*;
import java.util.stream.Collectors;

//mark the class as final to prevent inheritance
public final class EmployeeImmutableClass {
    //mark all attributes as private and final
    private final String name;
    private final Date doj;
    private final List<String> phoneno;
    //Handling a mutable class inside immutable class
    private AddressMutable address;

    public AddressMutable getAddress() {
        return new AddressMutable(this.address.getCity(), this.address.getZip()); // Return a new instance to maintain immutability
    }

    public EmployeeImmutableClass(String name, Date doj, List<String> phoneno, AddressMutable address) {
        this.name = name;
        this.doj = doj;
        this.phoneno = phoneno;
        this.address = address; // AddressMutable is mutable, so we should be careful with how we handle it
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
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        AddressMutable address= new AddressMutable("New York", "10001");
        EmployeeImmutableClass e= new EmployeeImmutableClass("John Doe", new Date(), Arrays.stream(new String[]{"123","234"}).collect(Collectors.toList()), address);
        e.getDoj().setDate(15);// This will not change the original date in the EmployeeImmutableClass
        e.getAddress().setCity("Los Angeles"); // This will not change the original address in the EmployeeImmutableClass
        System.out.println(e);
    }
}
