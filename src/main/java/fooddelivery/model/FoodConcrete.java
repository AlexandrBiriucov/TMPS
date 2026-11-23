package fooddelivery.model;

import java.math.BigDecimal;

public  class FoodConcrete implements Food {
 

private String name;
    private BigDecimal price;

    public FoodConcrete(String name,BigDecimal price){
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
