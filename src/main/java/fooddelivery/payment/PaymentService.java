package fooddelivery.payment;

import java.math.BigDecimal;
import java.util.Optional;

public interface PaymentService {
//   public void recieveAmount(BigDecimal total);
//     public void processPayment();
//     public void respond();   // violates ISP i think
    
    public boolean pay(BigDecimal total);





}
