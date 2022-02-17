package Composite;

public interface Component {
    String operation();
    void addChild(Component child);
    void removeChild(Component child);
    boolean hasChildren();


}
