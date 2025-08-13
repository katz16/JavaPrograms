package org.example.oop;

public class FinalizeDemo  {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called. Object is being garbage collected.");
    }
    public static void main(String[] args) {
        FinalizeDemo obj = new FinalizeDemo();
        obj = null; // Make the object eligible for garbage collection
        System.gc(); // Suggest JVM to run garbage collector
        System.out.println("End of main method.");
    }
}
