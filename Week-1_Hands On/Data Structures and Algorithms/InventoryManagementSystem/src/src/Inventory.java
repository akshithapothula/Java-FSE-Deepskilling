import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> products = new HashMap<>();

    // Add product
    public void addProduct(Product p) {
        products.put(p.productId, p);
        System.out.println("Added: " + p.productName);
    }

    // Update product
    public void updateProduct(int productId, int quantity, double price) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Updated: " + p.productName);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            System.out.println("Deleted: " + products.get(productId).productName);
            products.remove(productId);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    // Display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\n--- Inventory ---");
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}
