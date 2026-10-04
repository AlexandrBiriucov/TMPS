package src.main.java.fooddelivery.model;


public class Order {

    private Customer customer;
    private Restaurant restaurant;
    private OrderItem items;

    public Order(Customer customer, Restaurant restaurant, OrderItem items){
        this.customer=customer;
        this.restaurant=restaurant;
        this.items=items;
    }

    public void finalOrderDeatails(){

    System.out.println(customer.getName()+customer.getEmail()+customer.getLocation());

}



    }
