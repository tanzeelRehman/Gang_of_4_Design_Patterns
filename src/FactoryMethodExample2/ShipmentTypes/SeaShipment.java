package FactoryMethodExample2.ShipmentTypes;

import FactoryMethodExample2.Shipments;

public class SeaShipment implements Shipments {
    @Override
    public void startShipment() {
        System.out.println("Starting Sea Shipment");
    }
}
