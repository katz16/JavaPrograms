package org.example.oop;

public class Child extends Parent{
    /*public Child(){
        super();
    }*/
    //If we override m1 in Child, then we get child m1 method output
    //If we do not override m1 in Child, then we get parent m1 method output
    @Override
    public void m1() {

        System.out.println("Child m1");;
    }
    public static void m2(){
        System.out.println("Child m2 static method");
    }

    public static void main(String[] args) {
        Parent p= new Child();
        p.m1(); // This will call Child's m1 method due to dynamic method dispatch

        Child c= new Child();
        c.m1();
        //Method hiding. Parent calling m2 static method and child calling m2 static method
        Parent.m2();
        Child.m2();
    }
}
