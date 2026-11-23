package fooddelivery.notification;

import fooddelivery.model.*;

public class EmailNotifier implements  Notifier{
    
   public void notify(Order order){

    System.out.println("Email Notification sent" + order.getCustomer().getEmail());

   }


}
