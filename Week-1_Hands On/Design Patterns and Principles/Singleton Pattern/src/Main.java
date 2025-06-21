package SinglePatternExample;

public class Main {
    public static void main(String[] args) {
        // Get the logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Try to get another instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances exist. Singleton failed.");
        }
    }
}
