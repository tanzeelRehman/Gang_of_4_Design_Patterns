package FactoryMethodExample2;

import FactoryMethodExample2.ShipmentTypes.RoadShipment;

public class GetRoadShipment extends GetShipment{


    @Override
    Shipments getShipment() {
        return new RoadShipment();
    }
}
