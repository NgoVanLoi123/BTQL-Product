package entity;



public class Product {
    private int id;
    private static int autoId;
    private String name;
    private String description;
    private int quantity;
    private String units;
    private double price;

    public Product(String name, String description, int quantity, String units, double price) {
        this.id =++autoId;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.units = units;
        this.price = price;
    }
    public Product() {
        this.id =++autoId;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", units='" + units + '\'' +
                ", price=" + price +
                '}';
    }
}

