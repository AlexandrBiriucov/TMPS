package src.main.java.fooddelivery.notification;

import src.main.java.fooddelivery.model.Order;

public abstract class NotificationFactory {
    public Notifier create() {
        Notifier notifier = createNotifier();
        // notifier.notify();
        return notifier;
    }
    
    protected abstract Notifier createNotifier();
}
