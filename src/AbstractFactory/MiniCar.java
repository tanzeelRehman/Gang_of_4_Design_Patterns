package AbstractFactory;

public class MiniCar extends Car {
    MiniCar(Location location) {
		super(CarType.MINICAR,location );
        construct();
    }

    @Override
    void construct() {
        System.out.println("This is Mini car");
    }
    }
