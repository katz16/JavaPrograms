package org.example.oop;

public class GooglePay implements Payment{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction of " + amount + " done using Google Pay.");
    }
    // it is not mandatory to override the default method. we need to override only if we want to change the implementation

    @Override
    public void addCoupon() {
        System.out.println("add 10rs cashback using Google Pay");
    }

    public static void generateTransactionReport() {
        System.out.println("Generating Google Pay transaction report...");
    }

    public static void main(String[] args) {
        Payment p= new GooglePay();
        p.addCoupon();
        p.doTransaction(100);
        Payment.generateTransactionReport();
        GooglePay.generateTransactionReport();

        GooglePay g= new GooglePay();
        //calling addCoupon using GooglePay object
        g.addCoupon();

    }
}
