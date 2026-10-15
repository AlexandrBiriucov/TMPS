package src.main.java.fooddelivery.service;


import src.main.java.fooddelivery.model.Order;
import src.main.java.fooddelivery.notification.Notifier;
import src.main.java.fooddelivery.printing.OrderPrinting;
public class OrderService {
    
    
    private final Notifier notifier;
    private final OrderPrinting printer;


    public OrderService(Notifier notifier, OrderPrinting printer){

        this.notifier = notifier;
        this.printer = printer;

    }

    public void  placeOrder(Order order){
        notifier.notify(order);
        printer.print(order);
    }
    

    // public void sendNotification(Notifier notification){

    //     notify();
    // }
    



    
}
