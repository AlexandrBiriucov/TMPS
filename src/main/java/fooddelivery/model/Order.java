package src.main.java.fooddelivery.model;
import java.util.List;
import java.math.BigDecimal;
public class Order {

    private final Customer customer;
    private final Restaurant restaurant;
    private final List<OrderItem> items;

    public Order(Customer customer, Restaurant restaurant, List<OrderItem> items){
        this.customer=customer;
        this.restaurant=restaurant;
        this.items=List.copyOf(items);
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

    }
