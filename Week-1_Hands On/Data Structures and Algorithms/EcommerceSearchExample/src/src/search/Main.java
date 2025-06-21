package search;

public class Main {
    public static void main(String[] args) {
        Product[] inventory = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Clothing"),
                new Product(3, "Keyboard", "Electronics"),
                new Product(4, "Book", "Education"),
                new Product(5, "Mouse", "Electronics")
        };

        System.out.println("=== Linear Search ===");
        Product matchedItem = ProductSearch.findByNameLinear(inventory, "Keyboard");
        System.out.println(matchedItem != null ? "Found: " + matchedItem : "Product not found");

        ProductSearch.sortProductsByName(inventory);

        System.out.println("=== Binary Search ===");
        matchedItem = ProductSearch.findByNameBinary(inventory, "Keyboard");
        System.out.println(matchedItem != null ? "Found: " + matchedItem : "Product not found");
    }
}