public class EmployeeManagement {
    private Employee[] employees = new Employee[100];
    private int count = 0;

    // Add new employee
    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println("Added: " + e.name);
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Search employee by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Delete employee by ID
    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Deleted: " + employees[i].name);
                // Shift elements
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                return;
            }
        }
        System.out.println("Employee ID " + id + " not found.");
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        System.out.println("\n--- Employee List ---");
        if (count == 0) {
            System.out.println("No employees found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }
}
