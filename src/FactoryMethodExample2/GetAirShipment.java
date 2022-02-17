package FactoryMethodExample2;

import FactoryMethodExample2.ShipmentTypes.AirShipment;

public class GetAirShipment extends GetShipment{

    @Override
    Shipments getShipment() {
        return new AirShipment();
    }
}
