public class Main {
    public static void main(String[] args) {
        // Stripe payment via adapter
        PaymentProcessor stripePayment = new StripeAdapter(new StripeAPI());
        stripePayment.processPayment(1500.00);

        // PayPal payment via adapter
        PaymentProcessor paypalPayment = new PayPalAdapter(new PayPalAPI());
        paypalPayment.processPayment(2250.50);
    }
}
