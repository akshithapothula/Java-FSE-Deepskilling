package search;

public class Product {
    private final int id;
    private final String name;
    private final String type;

    public Product(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + type + ")";
    }
}
