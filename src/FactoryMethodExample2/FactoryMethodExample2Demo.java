package FactoryMethodExample2;

import FactoryMethodExample1.Shape;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodExample2Demo {
    public static void main(String[] args) {
        List<Shipments> shipmentsList = new ArrayList<Shipments>();

        //<-- Get Air/Road/Sea Shipment will return Object of Air/Road/Sea shipment Class, Of Type Shipments
    GetAirShipment getAirShipment = new GetAirShipment();
    GetRoadShipment getRoadShipment = new GetRoadShipment();
    GetSeaShipment getSeaShipment = new GetSeaShipment();

        //<-- Air/Road/Sea Shipment class has Type Shipments[Interface]
    Shipments airshipmentobject = getAirShipment.getShipment();
    Shipments seashipmentobject = getSeaShipment.getShipment();
    Shipments roadshipmentobject = getRoadShipment.getShipment();

        //<-- Air/Road/Sea Shipment class has only 1 Method which is startShipment
    airshipmentobject.startShipment();
    seashipmentobject.startShipment();
    roadshipmentobject.startShipment();

        //<-- We can add Air/Road/Sea Shipment objects in shipments array which is of Type Shipments[Interface]
    shipmentsList.add(getAirShipment.getShipment());
    shipmentsList.add(getSeaShipment.getShipment());
    shipmentsList.add(getSeaShipment.getShipment());
    shipmentsList.add(getRoadShipment.getShipment());


        //<-- And iterate the method from objects
    for (Shipments item: shipmentsList ) {
        item.startShipment();
    }


    }
}
