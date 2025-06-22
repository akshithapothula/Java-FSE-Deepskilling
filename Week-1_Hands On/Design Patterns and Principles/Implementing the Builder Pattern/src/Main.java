public class Main {
    public static void main(String[] args) {
        // Basic computer with just CPU and RAM
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println("Basic Configuration:");
        System.out.println(basicComputer);

        // High-end computer with storage and graphics
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();
        System.out.println("\nGaming Configuration:");
        System.out.println(gamingPC);

        // Mid-range configuration
        Computer officePC = new Computer.Builder("Intel i7", "16GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println("\nOffice Configuration:");
        System.out.println(officePC);
    }
}
