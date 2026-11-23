package src.main.java.fooddelivery.service;

import java.math.BigDecimal;

public class CardPayment implements PaymentService {





    public void recieve(BigDecimal total){
        System.out.println("recieved order with a total of " + total);
    }



    public void process(){
        
        System.out.println("processing the payment");
    }

    @Override
    public boolean pay(BigDecimal total){
        recieve(total);
        process();
        System.out.println("payment succesful, Thank You");
        return  true;
    } 


     
    

}
