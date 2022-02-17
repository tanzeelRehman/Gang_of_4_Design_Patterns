import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
    public static void main(String[] args) {

        AirShipment airShipment = new Shipment();
        SeaShipment seaShipment = new Shipment();
        RoadShipment roadShipment = new Shipment();
        airShipment.beginAirShipmet();
        seaShipment.beginSeaShipmet();
        roadShipment.beginRoadShipmet();


    }
}

interface AirShipment{
    void beginAirShipmet();
}
interface SeaShipment{
    void beginSeaShipmet();
}
interface RoadShipment{
    void beginRoadShipmet();
}
class Shipment implements  AirShipment,SeaShipment,RoadShipment {
    void checkShipment() {
        System.out.println("Checking Shipment...");
    }

    @Override
    public void beginAirShipmet() {
        System.out.println("Starting AirShipment..");
    }

    @Override
    public void beginSeaShipmet() {
        System.out.println("Starting SeaShipment..");
    }

    @Override
    public void beginRoadShipmet() {
        System.out.println("Starting RoadShipment..");
    }
}

