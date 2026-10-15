package src.main.java.fooddelivery.notification;

import src.main.java.fooddelivery.model.*;

public class EmailNotifier implements  Notifier{
    
   public void notify(Order order){

    System.out.println("Email Notification sent" + order.getCustomer().getEmail());

   }


}
