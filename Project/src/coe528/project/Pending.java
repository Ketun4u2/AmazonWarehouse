package coe528.project;

public class Pending extends Shipper {

    private static int ExpShip = 360; //Just meant to be longest time for shipping.

    protected Pending(String name, String location) {
        super(name, location, ExpShip);
    }

    protected String ShippingTimes() {
        return "Pending";
    }


}
