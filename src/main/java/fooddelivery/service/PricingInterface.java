package src.main.java.fooddelivery.service;
import java.math.BigDecimal;

import src.main.java.fooddelivery.model.Order;
public interface PricingInterface {
    
    public BigDecimal calculateFinalPrice(Order order);

    



}
