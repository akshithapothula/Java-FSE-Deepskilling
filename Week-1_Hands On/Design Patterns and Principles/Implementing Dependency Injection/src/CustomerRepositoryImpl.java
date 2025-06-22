import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        customers.put("C001", new Customer("C001", "Aravind"));
        customers.put("C002", new Customer("C002", "Sneha"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
