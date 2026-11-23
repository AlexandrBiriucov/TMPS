package src.main.java.fooddelivery.decorator;

import java.math.BigDecimal;

import src.main.java.fooddelivery.model.Food;

public abstract class FoodDecorator implements Food {

    Food food;

    
    public FoodDecorator(Food food){

        this.food=food;
        
    }

    
    public BigDecimal getPrice(){

        return food.getPrice();

    }
    
    public String getName(){
        return food.getName();

        
    }
    






}
