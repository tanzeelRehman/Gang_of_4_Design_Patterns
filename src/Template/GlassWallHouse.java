package Template;

public class GlassWallHouse extends House {

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
        System.out.println("Constructing glass Doors");
    }

    @Override
    void constructWindows() {
        System.out.println("Constructing glass windows");
    }

    @Override
    void constructWalls() {
        System.out.println("Constructing glass Walls");
    }
}
