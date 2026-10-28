package src.main.java.fooddelivery.util;

import java.util.concurrent.atomic.AtomicInteger;

import src.main.java.fooddelivery.model.Order;
import test.SingletonLazy;

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




