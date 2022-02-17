package AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        CarFactory pkfc = new PakistanCarFactory();
        CarFactory eufc= new EUCarfactory();

        System.out.println(pkfc.createLuxuryCar());
        System.out.println(eufc.createMiniCar());

    }
}
