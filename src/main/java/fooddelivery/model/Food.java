package src.main.java.fooddelivery.model;

public class Food {

    private String name;
    private float price;

    public Food(String name,float price){
        this.name=name;
        this.price=price;

    }
    
    public String getName(){
        return this.name;
    }
    
    public Float getPrice(){
        return this.price;


    }


    
} 
    




