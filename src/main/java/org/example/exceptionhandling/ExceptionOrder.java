package org.example.exceptionhandling;

public class ExceptionOrder {
    //explain the order in which the exception has to be declared
    //Parent exception should be declared last and child exception should be declared first.
    //If the parent exception is declared first, it will catch all exceptions including the child exceptions,
    //and the child exceptions will never be reached. This is because the parent exception is more
    public static void main(String[] args) {
        try{
            int result=10/0; // This will throw ArithmeticException
        }
        catch(ArithmeticException e){//---> the exception will be caught here itself
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
