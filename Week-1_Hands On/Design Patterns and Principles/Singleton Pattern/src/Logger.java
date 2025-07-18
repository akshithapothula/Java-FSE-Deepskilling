package SinglePatternExample;

public class Logger {
    // Step 2: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to return the same instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
