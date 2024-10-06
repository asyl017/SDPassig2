package notifications;

import interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending Push notification: " + message);
    }
}
