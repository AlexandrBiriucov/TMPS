package fooddelivery.service;
import fooddelivery.model.Order;
import fooddelivery.model.OrderItem;
public class OrderValidator {
    





    public  boolean orderCheck(Order order){

        if (order ==null){
            return false;
        }

        if (order.getItems()==null){
            return  false;
        }
         
        if (order.getItems().size() <=0){
            return  false;
        }        

        if (order.getRestaurant()==null){
            return false;
        }

        for (OrderItem item : order.getItems()){
            if (item.getQuantity()<=0){
                return false;   
            }

        }

        for (OrderItem item : order.getItems()) {
        if (item == null || item.getQuantity() <= 0) {
            return false;
        }
    }


        return true;

    }


    // public  boolean restaurantAccept(Order order){
    //     return order.getRestaurant().sendResponse();


    // }


    // public  boolean  validate(Order order){
    //     if (!orderCheck(order)){
    //         System.out.println("order not accepted");
    //         return false;
    //     }
    //     System.out.println("order accpeted");
    //     return true;
        

    // }


    


    





}
