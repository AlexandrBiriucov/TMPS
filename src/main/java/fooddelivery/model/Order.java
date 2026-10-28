package src.main.java.fooddelivery.model;
import java.util.List;

import src.main.java.fooddelivery.util.OrderIdGenerator;

import java.math.BigDecimal;
public class Order {
    private final int OrderID;
    private final Customer customer;
    private final Restaurant restaurant;
    private final List<OrderItem> items;


    // public Order(Customer customer, Restaurant restaurant, List<OrderItem> items){
    //     this.customer=customer;
    //     this.restaurant=restaurant;
    //     this.items=List.copyOf(items);
    // }


    Order(Builder builder) {
        this.OrderID = OrderIdGenerator.getInstance().nextId();
        this.customer = builder.customer;
        this.restaurant = builder.restaurant;
        this.items = builder.items;
    }


    public int getId(){
        return this.OrderID;


    }

    public Customer getCustomer(){
        return this.customer;
    }

    public Restaurant getRestaurant(){
        return this.restaurant;

    }

    public List<OrderItem> getItems(){

        return this.items;
    }


    public BigDecimal getTotal(){
        return items.stream().map(OrderItem::getSubTotal).reduce(BigDecimal.ZERO,BigDecimal::add);

}




    public static class Builder{

        private  Customer customer;
        private  Restaurant restaurant;
        private  List<OrderItem> items;


        public Builder customer(Customer customer){
            this.customer = customer;
            return this;

        }

        public Builder restaurant(Restaurant restaurant){
            this.restaurant = restaurant;
            return this;

        }


        public Builder items(List<OrderItem> items){
            this.items = List.copyOf(items);
            return this;


        }



        public Order build(){
            return new Order(this);

        }






    }












    }
