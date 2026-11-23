package fooddelivery.notification;

import fooddelivery.model.*;

public class SMSNotifier implements  Notifier{
    
   public void notify(Order order){

    System.out.println("SMS notification sent" + order.getCustomer().getEmail());

   }


}
