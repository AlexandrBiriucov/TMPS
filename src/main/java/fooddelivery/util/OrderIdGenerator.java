package fooddelivery.util;

import java.util.concurrent.atomic.AtomicInteger;

import fooddelivery.model.Order;


//singleton

public final class OrderIdGenerator{

private static  OrderIdGenerator  INSTANCE;
private final AtomicInteger counter = new AtomicInteger(0);
private OrderIdGenerator(){

}



public static OrderIdGenerator getInstance(){
if (INSTANCE == null ){
        INSTANCE = new OrderIdGenerator();
            
    }
    return INSTANCE;

}


public int nextId(){
    return counter.incrementAndGet();

}



}




