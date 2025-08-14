package org.example.oop;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Alice");
        Employee e2 = new Employee(100, "Alice");
        if (e1.equals(e2)) {
            System.out.println("e1 and e2 are equal");
        }
        else
        {
            System.out.println("e1 and e2 are not equal");
        }
        System.out.println("e1 hashCode: " + e1.hashCode());
        System.out.println("e2 hashCode: " + e2.hashCode());
    }
}
