package org.example.oop;

public class AmazonPay implements Payment{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction of " + amount + " done using Amazon Pay.");
    }
    //Here we have not overridden the default method addCoupon, so it will use the default implementation from Payment interface.
    public static void main(String[] args) {
        Payment p = new AmazonPay();
        p.addCoupon(); // Calls the default method from Payment interface
        p.doTransaction(200); // Calls the overridden method in AmazonPay
        Payment.generateTransactionReport(); // Calls the static method from Payment interface

        AmazonPay a= new AmazonPay();
        //calling addCoupon default method with AmazonPay object
        a.addCoupon();
    }
}
