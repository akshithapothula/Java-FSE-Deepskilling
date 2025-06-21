public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create products
        Product p1 = new Product(101, "Laptop", 5, 75000.0);
        Product p2 = new Product(102, "Smartphone", 10, 20000.0);
        Product p3 = new Product(103, "Headphones", 20, 1500.0);

        // Add products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Display inventory
        inventory.displayProducts();

        // Update a product
        inventory.updateProduct(102, 12, 19500.0);

        // Delete a product
        inventory.deleteProduct(103);

        // Display after update and delete
        inventory.displayProducts();
    }
}
