package com.pheakuniverse.store;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

//    @Autowired //this annotation cuz not to auto default constructor
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
