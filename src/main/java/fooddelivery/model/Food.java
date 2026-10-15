package src.main.java.fooddelivery.model;

import java.math.BigDecimal;
public class Food {

    private String name;
    private BigDecimal price;

    public Food(String name,BigDecimal price){
        this.name=name;
        this.price=price;

    }
    
    public String getName(){
        return this.name;
    }
    
    public BigDecimal getPrice(){
        return this.price;


    }


    
} 
    




