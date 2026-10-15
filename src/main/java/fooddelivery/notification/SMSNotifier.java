package src.main.java.fooddelivery.notification;

import src.main.java.fooddelivery.model.*;

public class SMSNotifier implements  Notifier{
    
   public void notify(Order order){

    System.out.println("SMS notification sent" + order.getCustomer().getEmail());

   }


}
