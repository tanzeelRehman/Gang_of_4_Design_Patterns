package FactoryMethodExample2;

import FactoryMethodExample2.ShipmentTypes.SeaShipment;

public class GetSeaShipment extends  GetShipment{
    @Override
    Shipments getShipment() {
        return new SeaShipment();
    }
}
