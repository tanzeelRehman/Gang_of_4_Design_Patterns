package Mids.Iterator;

public class Item {


    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    String name;
    ItemType type;
    public Item(String name,ItemType type) {
        this.name = name;
        this.type = type;
    }


}
