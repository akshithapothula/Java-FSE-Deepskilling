public class Main {
    public static void main(String[] args) {
        // Send Email only
        Notifier emailOnly = new EmailNotifier();
        System.out.println("== Email Notification ==");
        emailOnly.send("Server is up!");

        // Send Email + SMS
        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("\n== Email + SMS Notification ==");
        emailAndSMS.send("Database backup completed!");

        // Send Email + SMS + Slack
        Notifier fullNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));
        System.out.println("\n== Email + SMS + Slack Notification ==");
        fullNotifier.send("Critical error occurred!");
    }
}
