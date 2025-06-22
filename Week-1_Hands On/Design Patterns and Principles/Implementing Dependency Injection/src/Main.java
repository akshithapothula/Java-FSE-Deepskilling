public class Main {
    public static void main(String[] args) {
        // Injecting dependency
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Test
        System.out.println("=== Finding Customer C001 ===");
        service.showCustomerDetails("C001");

        System.out.println("\n=== Finding Customer C003 ===");
        service.showCustomerDetails("C003");
    }
}
