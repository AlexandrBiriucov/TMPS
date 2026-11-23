package src.main.java.fooddelivery.service;

import src.main.java.fooddelivery.model.Order;

public class CheckoutFacade {


    private PaymentService paymentService;
    // private PricingService pricingService;
    private OrderService orderService;
    private OrderValidator orderValidator;

    CheckoutFacade(PaymentService paymentService,PricingService pricingService,OrderService orderService,OrderValidator orderValidator){
        this.paymentService=paymentService;
        // this.pricingService= pricingService;
        this.orderService = orderService;
        this.orderValidator = orderValidator;    
    }


    public boolean checkout(Order order){

        if(!orderValidator.orderCheck(order)) return false;

        paymentService.pay(order.getTotal());

        orderService.placeOrder(order);

        return true;

    }







}
