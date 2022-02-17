package FactoryMethodExample2.ShipmentTypes;

import FactoryMethodExample2.Shipments;

public class RoadShipment implements Shipments {
    @Override
    public void startShipment() {
        System.out.println("Starting Road Shipment");
    }
}
