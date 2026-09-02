package Classes.Exercise1;

public class Products {
    private static int nextId = 1;
    private int Id;
    private String Name;
    private double Price;
    private int Quantity;

    public Products(String name, double price, int quantity) {
        Id = nextId++;
        Name = name;
        Price = price;
        Quantity = quantity;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    
    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}