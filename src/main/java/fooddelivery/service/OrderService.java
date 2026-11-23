package fooddelivery.service;


import fooddelivery.model.Order;
import fooddelivery.notification.Notifier;
import fooddelivery.printing.OrderPrinting;
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
