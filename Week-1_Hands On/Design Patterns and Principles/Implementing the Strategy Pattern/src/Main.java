public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        context.executePayment(2000.00);

        // Using PayPal
        context.setPaymentStrategy(new PayPalPayment("john@example.com"));
        context.executePayment(3200.50);
    }
}
