package com.pheakuniverse.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) { //this act like setter
        this.paymentService = paymentService;
    }
    
    public void placeOrder() {
//        var stripePaymentService = new StripePaymentService();
        paymentService.processPayment(10 );
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
