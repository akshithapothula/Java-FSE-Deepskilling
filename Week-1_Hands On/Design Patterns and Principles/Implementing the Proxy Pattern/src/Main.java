public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image1 - first time: will load from server
        System.out.println("\nDisplaying image1 first time:");
        image1.display();

        // Image1 - second time: will use cache
        System.out.println("\nDisplaying image1 second time:");
        image1.display();

        // Image2 - first time
        System.out.println("\nDisplaying image2 first time:");
        image2.display();
    }
}
