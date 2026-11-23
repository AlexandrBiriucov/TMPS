package fooddelivery.service;

import fooddelivery.model.Order;
import fooddelivery.payment.PaymentService;

public class CheckoutFacade {


    private final PaymentService paymentService;
    // private PricingService pricingService;
    private final OrderService orderService;
    private  OrderValidator orderValidator;

    public CheckoutFacade(PaymentService paymentService,OrderValidator orderValidator,OrderService orderService){
        this.paymentService=paymentService;
        // this.pricingService= pricingService;
        this.orderService = orderService;
        this.orderValidator = orderValidator;    
    }


    public boolean checkout(Order order){

        if(!orderValidator.orderCheck(order)) return false;
        
        
            if (!order.getRestaurant().sendResponse()) {
       return false;
            }



       if (!paymentService.pay(order.getTotal())) return false;


       
        orderService.placeOrder(order);




        return true;

    }







}
