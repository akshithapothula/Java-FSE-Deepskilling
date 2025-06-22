public class CustomerService {
    private final CustomerRepository repository;

    // Constructor injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void showCustomerDetails(String customerId) {
        Customer customer = repository.findCustomerById(customerId);
        if (customer != null) {
            System.out.println("Customer ID   : " + customer.getId());
            System.out.println("Customer Name : " + customer.getName());
        } else {
            System.out.println("Customer not found for ID: " + customerId);
        }
    }
}
