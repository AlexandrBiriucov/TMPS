import src.main.java.fooddelivery.model.Customer;
import src.main.java.fooddelivery.model.Food;
import src.main.java.fooddelivery.model.Menu;
public class Main {
 
    public static void main(String[] args){
        Customer customer1 = new Customer("Alex@gmail.com", "Alex", "Chisinau");
        // System.out.println(customer1.getLocation());
        Food item1 = new Food("pizza", 23f); 
        Food item2 = new Food("cheeseburger", 23f); 
        Food item3 = new Food("Steak",12f);
        Menu menu1 = new Menu();
        menu1.addItem(item1);
        menu1.addItem(item2);
        menu1.addItem(item3);
    }

    
}
