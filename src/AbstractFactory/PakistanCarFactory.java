package AbstractFactory;

public class PakistanCarFactory implements CarFactory{

    @Override
    public Car createLuxuryCar() {
        return new LuxuaryCar(Location.PAKISTAN);
    }

    @Override
    public Car createMiniCar() {
        return new MiniCar(Location.PAKISTAN);
    }


}
