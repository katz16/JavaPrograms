package org.example.stream;

import org.example.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEmployee {
    public static void main(String[] args) {
        Employee e1= new Employee("Alice", 18);
        Employee e2= new Employee("Bob", 25);
        Employee e3= new Employee("Charlie", 19);
        Employee e4= new Employee("David", 20);
        Employee e5= new Employee("Eve", 22);
        Employee e6= new Employee("Frank", 40);
        List<Employee> employees = List.of(e1, e2, e3, e4, e5, e6);

        //Filtering employees older than 20
        employees.stream().filter(e->e.getAge()>20).forEach(e-> System.out.println(e.getName()));
        //Filtering employees and storing them in a new list
        List<Employee>listOfEmpgreaterthan20=employees.stream().filter(e->e.getAge()>20).toList();
        System.out.println("Employees older than 20: "+listOfEmpgreaterthan20.stream().map(Employee::getName).toList());
        //Counting emp whoes age is 25
        Long empcount=employees.stream().filter(e->e.getAge()==25).count();
        System.out.println("Number of employees with age 25: " + empcount);

        //Group by Employee name
        Map<String,List<Employee>>empByName=employees.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println("Grouping by Employee name: "+empByName);
    }
}
