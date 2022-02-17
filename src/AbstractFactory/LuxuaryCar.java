package AbstractFactory;

public class LuxuaryCar extends Car{
    public LuxuaryCar( Location location) {
        super(CarType.LUXUARYCAR, location);
    }

    @Override
    void construct() {
        System.out.println("This is luxuary Car");
    }
}
