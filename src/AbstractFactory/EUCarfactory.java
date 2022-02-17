package AbstractFactory;

public class EUCarfactory implements CarFactory{
    @Override
    public Car createLuxuryCar() {
        return new LuxuaryCar(Location.EU);
    }

    @Override
    public Car createMiniCar() {
        return new MiniCar(Location.EU);
    }
}
