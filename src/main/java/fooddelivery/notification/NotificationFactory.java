package fooddelivery.notification;

import fooddelivery.model.Order;

public abstract class NotificationFactory {
    public Notifier create() {
        Notifier notifier = createNotifier();
        // notifier.notify();
        return notifier;
    }
    
    protected abstract Notifier createNotifier();
}
