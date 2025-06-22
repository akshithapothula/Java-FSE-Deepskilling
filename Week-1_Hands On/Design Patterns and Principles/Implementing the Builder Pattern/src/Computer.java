public class Computer {
    // Required attributes
    private String cpu;
    private String ram;

    // Optional attributes
    private String storage;
    private String graphicsCard;

    // Private constructor accepting Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Getters for display
    public String toString() {
        return "CPU: " + cpu + ", RAM: " + ram +
                ", Storage: " + (storage != null ? storage : "None") +
                ", Graphics: " + (graphicsCard != null ? graphicsCard : "None");
    }

    // Static nested Builder class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
