package fooddelivery.decorator;

import java.math.BigDecimal;

import fooddelivery.model.Food;

public class BaconDecorator extends FoodDecorator {

BaconDecorator(Food food){
        super(food);
        
        

    }

     @Override
    public BigDecimal getPrice() {
        return food.getPrice().add(new BigDecimal("3.00"));
    }

    
    

}
