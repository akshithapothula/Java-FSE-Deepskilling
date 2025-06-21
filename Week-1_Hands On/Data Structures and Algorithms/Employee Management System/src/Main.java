public class Main {
    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement();

        // Create sample employees
        Employee e1 = new Employee(1, "Alice", "Developer", 60000.0);
        Employee e2 = new Employee(2, "Bob", "Manager", 80000.0);
        Employee e3 = new Employee(3, "Charlie", "Tester", 45000.0);

        // Add employees
        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        // Traverse employees
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\n--- Search Employee with ID 2 ---");
        Employee found = ems.searchEmployee(2);
        System.out.println(found != null ? found : "Employee not found.");

        // Delete an employee
        ems.deleteEmployee(2);

        // Traverse again
        ems.traverseEmployees();
    }
}
