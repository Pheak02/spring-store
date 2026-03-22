package com.pheakuniverse.store;

public class OrderService {
    public void placeOrder() {
        var stripePaymentService = new StripePaymentService();
        stripePaymentService.processPayment(10 );
    }
}
