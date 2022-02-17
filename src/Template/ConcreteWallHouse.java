package Template;

public class ConcreteWallHouse extends House{
    @Override
    void decorateHouse() {
        System.out.println("Decorating House");
    }

    @Override
    void paintHouse() {
        System.out.println("Painting House");
    }

    @Override
    void constructDoors() {
        System.out.println("Constructing concrete doors");
    }

    @Override
    void constructWindows() {
        System.out.println("Constructing concrete windows");
    }

    @Override
    void constructWalls() {
        System.out.println("Constructing concrete Walls");
    }
}
