package Strategy;

public class Item {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
