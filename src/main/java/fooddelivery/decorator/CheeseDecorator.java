package fooddelivery.decorator;
import java.math.BigDecimal;

import fooddelivery.model.Food;
import fooddelivery.model.FoodConcrete;
public class CheeseDecorator extends FoodDecorator{
    

    CheeseDecorator(Food food){
        super(food);
        
        

    }

     @Override
    public BigDecimal getPrice() {
        return food.getPrice().add(new BigDecimal("2.00"));
    }





    // public static void main(String[] args) {
    //     Food burger = new FoodConcrete("BURGER",BigDecimal.valueOf(23));
    //     burger = new CheeseDecorator(burger);
    //     System.out.println(burger.getName() + burger.getPrice());
    // }


}
