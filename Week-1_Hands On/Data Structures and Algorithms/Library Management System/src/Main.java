public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "The Alchemist", "Paulo Coelho"),
                new Book(102, "A Brief History of Time", "Stephen Hawking"),
                new Book(103, "Clean Code", "Robert C. Martin"),
                new Book(104, "Java Programming", "James Gosling"),
                new Book(105, "The Hobbit", "J.R.R. Tolkien")
        };

        // Linear Search
        System.out.println("=== Linear Search ===");
        Book result1 = LibrarySearch.linearSearch(books, "Clean Code");
        System.out.println(result1 != null ? "Book found: " + result1 : "Book not found.");

        // Sort books before binary search
        LibrarySearch.sortBooksByTitle(books);

        // Binary Search
        System.out.println("\n=== Binary Search ===");
        Book result2 = LibrarySearch.binarySearch(books, "Clean Code");
        System.out.println(result2 != null ? "Book found: " + result2 : "Book not found.");
    }
}
