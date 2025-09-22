package org.example.recursion;
//This program demonstrates indirect recursion where two methods call each other.
//The odd() method prints even numbers and calls even(), while even() prints odd numbers and calls odd().
public class IndirectRecursion {
    public static void main(String[] args) {
        int i=1;
        odd(i);
    }

    private static void odd(int i) {
        if(i<=10){
            System.out.println(i+1);
            even(i+1);
        }
    }

    private static void even(int i) {
        if(i<=10){
            System.out.println(i-1);
            odd(i+1);
        }
    }
}
