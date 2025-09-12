package org.example.designpatterns;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton Instance 1: " + singleton1.hashCode());
        System.out.println("Singleton Instance 2: " + singleton2.hashCode());

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
