package src.main.java.fooddelivery.service;
import java.math.BigDecimal;
public class AtDoorPayment implements PaymentService {
    
    @Override 
   public boolean pay(BigDecimal total){

    System.out.println("Payment will be collected on delivery");
    return true;
   }


   



}


