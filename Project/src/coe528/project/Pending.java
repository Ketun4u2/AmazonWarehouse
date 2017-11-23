package coe528.project;

public class Pending extends Shipper {

    private static int ExpShip = 360; //Just meant to be longest time for shipping.

    public Pending(String name, String location) {
        super(name,location,ExpShip);
    }

    protected static String ShippingTimes() {
        return "Shipment Pending";
    }

    @Override
    protected String ETA() {
        return "Shipment Pending";
    }

    @Override
    protected String shipperName() {
        return "Pending";
    }
}
