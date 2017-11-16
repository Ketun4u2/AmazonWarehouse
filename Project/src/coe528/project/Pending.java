package coe528.project;

public class Pending extends Shipper {

    protected Pending() {}

    protected Pending(String name, String location) {
        super(name, location);
    }


    protected String ShippingTimes() {
        return "Pending";
    }


    @Override
    protected int toShip() {
        return 0;
    }
}
