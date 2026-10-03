package src.main.java.fooddelivery.model;

import java.lang.classfile.constantpool.InterfaceMethodRefEntry;

public class OrderItem {
    
public Food food;
public Integer quantity;

public OrderItem(Food food, Integer quantity){

    this.food=food;
    this.quantity= quantity;
}

public void printOrderDetails(Food food, Integer quantity){

    System.out.println(food.getName()+food.getPrice() + quantity);

}



}
