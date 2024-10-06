package notifications;

import interfaces.Notification;

public class SMS implements Notification {
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending SMS notification: " + message);

    }
}
