package src.main.java.fooddelivery.model;

import java.lang.classfile.constantpool.InterfaceMethodRefEntry;
import java.math.BigDecimal;


public class OrderItem {
    
private final Food food;
private final Integer quantity;

public OrderItem(Food food, Integer quantity){

    this.food=food;
    this.quantity= quantity;
}


public Food getFood(){
    return this.food;


}

public Integer getQuantity(){

    return quantity;
}

// public void printOrderDetails(Food food, Integer quantity){

//     System.out.println(food.getName()+food.getPrice() + quantity);

// }

public BigDecimal getSubTotal(){

return food.getPrice().multiply(BigDecimal.valueOf(quantity));

}


}
