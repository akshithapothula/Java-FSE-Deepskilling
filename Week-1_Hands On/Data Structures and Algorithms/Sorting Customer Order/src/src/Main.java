public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 3500.0),
                new Order(2, "Bob", 1200.0),
                new Order(3, "Charlie", 5400.0),
                new Order(4, "Diana", 2750.0),
                new Order(5, "Ethan", 1800.0)
        };

        System.out.println("=== Original Orders ===");
        OrderSorter.displayOrders(orders);

        // Test Bubble Sort
        System.out.println("\n=== Sorted by Bubble Sort ===");
        Order[] bubbleSorted = orders.clone();
        OrderSorter.bubbleSort(bubbleSorted);
        OrderSorter.displayOrders(bubbleSorted);

        // Test Quick Sort
        System.out.println("\n=== Sorted by Quick Sort ===");
        Order[] quickSorted = orders.clone();
        OrderSorter.quickSort(quickSorted, 0, quickSorted.length - 1);
        OrderSorter.displayOrders(quickSorted);
    }
}
