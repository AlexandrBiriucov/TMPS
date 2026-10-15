import java.math.BigDecimal;
import java.util.List;

import src.main.java.fooddelivery.model.Customer;
import src.main.java.fooddelivery.model.Food;
import src.main.java.fooddelivery.model.Menu;
import src.main.java.fooddelivery.model.Order;
import src.main.java.fooddelivery.model.OrderItem;
import src.main.java.fooddelivery.model.Restaurant;
import src.main.java.fooddelivery.notification.EmailNotifier;
import src.main.java.fooddelivery.service.OrderService;
import src.main.java.fooddelivery.model.Order;
import src.main.java.fooddelivery.printing.OrderPrinting;
public class Main {
 
    public static void main(String[] args){
        Customer customer1 = new Customer("Alex@gmail.com", "Alex", "Chisinau");
        // // System.out.println(customer1.getLocation());
        Food item1 = new Food("pizza",BigDecimal.valueOf(12.50)); 
        Food item2 = new Food("cheeseburger", BigDecimal.valueOf(7.50)); 
        Food item3 = new Food("Steak",BigDecimal.valueOf(13.50));
        Menu menu1 = new Menu();
        menu1.addItem(item1);   
        menu1.addItem(item2);
        menu1.addItem(item3);
        // menu1.printMenu();
        // OrderItem orderItem1 = new OrderItem(item3, 2);
        Restaurant restaurant1 = new Restaurant("McDondalds","Ciocani",menu1);
        // Order newOrder1=new Order(customer1, restaurant1, orderItem1);
        // newOrder1.finalOrderDeatails();
        
        OrderService orderService1 = new OrderService(new EmailNotifier(), new OrderPrinting());
        Order order = new Order(customer1, restaurant1, List.of(new OrderItem(item3, 2)));
        orderService1.placeOrder(order);

        


    }
    
}
