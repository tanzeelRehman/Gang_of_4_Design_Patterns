package FactoryMethodExample2.ShipmentTypes;

import FactoryMethodExample2.Shipments;

public class AirShipment implements Shipments {

    @Override
    public void startShipment() {
        System.out.println("Starting Air Shipment");
    }
}
