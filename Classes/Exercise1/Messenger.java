package Classes.Exercise1;

public class Messenger {
    private static int nextId = 1;
    private int Id;
    private String Name;private double Price;
    private int Deliveries_Quantity;

    public Messenger(String name, int deliveries_Quantity) {
        Id = nextId++;
        Name = name;
        Deliveries_Quantity = deliveries_Quantity;
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

    public int getDeliveries_Quantity() {
        return Deliveries_Quantity;
    }

    
    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDeliveries_Quantity(int quantity) {
        Deliveries_Quantity = quantity;
    }
}