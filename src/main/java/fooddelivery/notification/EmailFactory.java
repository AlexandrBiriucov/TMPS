package fooddelivery.notification;

public class EmailFactory extends NotificationFactory{

    @Override
    protected Notifier createNotifier() {
        
        return new EmailNotifier();
    }


}
