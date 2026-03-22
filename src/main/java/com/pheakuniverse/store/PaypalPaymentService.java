package com.pheakuniverse.store;

public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment");
        System.out.println("Amount:" + amount);
    }
}
