package src.main.java.fooddelivery.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

List<Food> MenuList = new ArrayList<>();

public void addItem(Food foodItem){

    MenuList.add(foodItem);
}   
    
public void removeItem(Food foodItem){

    MenuList.remove(foodItem);

}

public void findFood(){


}
    public void printMenu(){
        for (Food food : MenuList){
            System.out.println(food.getName() + " " +food.getPrice());
        }
        
    }

};

    


