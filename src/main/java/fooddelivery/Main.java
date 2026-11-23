
package fooddelivery;

import java.math.BigDecimal;
import java.util.List;

import fooddelivery.model.Customer;
import fooddelivery.model.Food;
import fooddelivery.model.FoodConcrete;
import fooddelivery.model.Menu;
import fooddelivery.model.Order;
import fooddelivery.model.OrderItem;
import fooddelivery.model.Restaurant;

import fooddelivery.notification.EmailFactory;
import fooddelivery.notification.NotificationFactory;

import fooddelivery.printing.OrderPrinting;

import fooddelivery.service.OrderService;
import fooddelivery.service.OrderValidator;
import fooddelivery.service.CheckoutFacade;

import fooddelivery.payment.PaymentService;
import fooddelivery.payment.PaymentAdapter;

import fooddelivery.external.StripePaymentGateway;

public class Main {

    public static void main(String[] args) {

        // Customer
        Customer customer1 = new Customer(
            "Alex@gmail.com", "Alex", "Chisinau"
        );

        // Food
        Food item1 = new FoodConcrete("pizza", BigDecimal.valueOf(12.50));
        Food item2 = new FoodConcrete("cheeseburger", BigDecimal.valueOf(7.50));
        Food item3 = new FoodConcrete("Steak", BigDecimal.valueOf(13.50));

        // Menu
        Menu menu1 = new Menu();
        menu1.addItem(item1);
        menu1.addItem(item2);
        menu1.addItem(item3);

        // Restaurant
        Restaurant restaurant1 = new Restaurant(
            "McDonalds", "Ciocani", menu1
        );

        // Order
        Order order = new Order.Builder()
            .customer(customer1)
            .restaurant(restaurant1)
            .items(List.of(new OrderItem(item3, 2)))
            .build();

        // Notification and OrderService
        NotificationFactory factory = new EmailFactory();

        OrderService orderService = new OrderService(
            factory.create(),
            new OrderPrinting()
        );

        // Validation
        OrderValidator validator = new OrderValidator();

        // Payment Adapter
        StripePaymentGateway stripeGateway = new StripePaymentGateway();
        PaymentService paymentService = new PaymentAdapter(stripeGateway);

        // Checkout Facade
        CheckoutFacade checkoutFacade = new CheckoutFacade(
            paymentService,
            validator,
            orderService
        );

        // Checkout
        boolean successful = checkoutFacade.checkout(order);

        if (successful) {
            System.out.println("Checkout successful!");
        } else {
            System.out.println("Checkout failed!");
        }
    }
}
