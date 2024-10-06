import notifications.EmailNotification;
import notifications.NotificationService;
import notifications.PushNotification;
import notifications.SMS;
import payments.CreditCardPayment;
import payments.PayPalPayment;
import payments.PaymentProcessor;



public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.addPaymentMethod(new CreditCardPayment());
        processor.addPaymentMethod(new PayPalPayment());

        processor.processAllPayments(100.0);

        NotificationService service = new NotificationService();
        service.addNotification(new SMS());
        service.addNotification(new EmailNotification());
        service.addNotification(new PushNotification());

        service.sendBulkNotifications("Hello, this is a test notification!");

    }
}
