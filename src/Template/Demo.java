package Template;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Going to build concrete wall house");
        House house = new ConcreteWallHouse();
        house.buildHouse();
        System.out.println("/////////////////////////////");
        System.out.println("Going to build glass wall house");
        House glasshouse = new GlassWallHouse();
        glasshouse.buildHouse();
    }
}
