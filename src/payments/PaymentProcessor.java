package payments;

import interfaces.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {
    private List<Payment> paymentMethods = new ArrayList<>();

    public void addPaymentMethod(Payment payment) {
        paymentMethods.add(payment);
    }

    public void processAllPayments(double amount) {
        for (Payment payment : paymentMethods) {
            payment.processPayment(amount);
        }
    }
}
