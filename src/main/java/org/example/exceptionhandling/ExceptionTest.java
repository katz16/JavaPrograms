package org.example.exceptionhandling;

public class ExceptionTest {
    public void getOrder(int orderId) throws OrderNotFoundException {
        // Simulating an order retrieval process
        if (orderId != 101) {
            throw new OrderNotFoundException("Order with ID " + orderId + " not found.");
        }
        else
            System.out.println("Order with ID " + orderId + " retrieved successfully.");
    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.getOrder(102);
        } catch (OrderNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
