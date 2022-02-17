package Template;

public abstract class House {
    final void buildHouse(){
        System.out.println("Building House");
        constructBase();
        constructWalls();
        constructRoof();
        constructDoors();
        constructWindows();
        paintHouse();
        decorateHouse();
    }
    abstract void decorateHouse();
    abstract void paintHouse();
    abstract void constructDoors();
    abstract void constructWindows();
    abstract void constructWalls();
    final void constructRoof(){
        System.out.println("Constructing Roof");
    }
    final void constructBase(){
        System.out.println("Constructing Base");
    }
}
