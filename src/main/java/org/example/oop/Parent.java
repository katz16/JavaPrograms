package org.example.oop;

public class Parent {
    //Parent m1 can throw Exception and this need not be handled in child class
    //But when child m1 throws Exception, then Parent m1 should also throw Exception
    public void m1() {
        System.out.println("Parent m1");
    }

    public static void m2(){
        System.out.println("Parent m2 static method");
    }

}
