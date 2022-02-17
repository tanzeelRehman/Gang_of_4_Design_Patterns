package Composite;

public class Leaf implements Component{
    @Override
    public String operation() {
        return "Leaf";
    }

    @Override
    public void addChild(Component child) {

    }

    @Override
    public void removeChild(Component child) {

    }

    @Override
    public boolean hasChildren() {
        return false;
    }
}
