package org.example.exceptionhandling;
//creating a custom exception class
public class OrderNotFoundException extends Exception {// extend Exception class
    //create a constructor to pass exception message
    public OrderNotFoundException(String message) {
        super(message); // call the constructor of the parent class Exception
    }
}
