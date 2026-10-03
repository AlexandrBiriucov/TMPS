package src.main.java.fooddelivery.model;


public class Customer {
    private String email;
    private String name;
    private String location;
    
    public Customer(String email, String name, String location){
        this.email=email;
        this.name=name;
        this.location=location;
    }


    public String getEmail(){
        return this.email;

    }
    
     
    public String getName(){
        return this.name;

    }


    public String getLocation(){
        return this.location;
    }
    
}
