package src.main.java.fooddelivery.printing;

import javax.swing.plaf.synth.SynthStyle;

import src.main.java.fooddelivery.model.*;
public class OrderPrinting {

    public void print(Order order){
        System.out.println("Customer :" + order.getCustomer().getName() +" " + order.getCustomer().getEmail() + " " +
         order.getCustomer().getLocation());    

         System.out.println("Restaurant:" + order.getRestaurant().getName() + " " + order.getRestaurant().getLocation() + " ");
            order.getRestaurant().getMenu().printMenu();

         for (OrderItem item : order.getItems()){

            System.out.println(" item name " + item.getFood().getName() + " item price " +item.getFood().getPrice() + 
            " items qunatity "+ item.getQuantity() + item.getSubTotal());

            System.out.println("Total is :" + order.getTotal());

         }

        


    }





}
