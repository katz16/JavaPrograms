package org.example.oop;

public interface Payment {
    public void doTransaction(int amount);
    public default void addCoupon() {
        System.out.println("add 5rs cashback");
    }

    public static void generateTransactionReport(){
        System.out.println("Generating transaction report...");
    }
}
