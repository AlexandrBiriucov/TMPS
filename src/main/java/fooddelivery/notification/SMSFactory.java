package src.main.java.fooddelivery.notification;

public class SMSFactory extends NotificationFactory {

@Override
protected Notifier createNotifier() {
    
    return new SMSNotifier();
}

}
