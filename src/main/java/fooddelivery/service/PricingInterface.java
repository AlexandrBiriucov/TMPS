package fooddelivery.service;
import java.math.BigDecimal;

import fooddelivery.model.Order;
public interface PricingInterface {
    
    public BigDecimal calculateFinalPrice(Order order);

    



}
