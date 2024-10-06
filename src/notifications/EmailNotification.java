package notifications;

import interfaces.Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending Email notification: " + message);
    }
}
