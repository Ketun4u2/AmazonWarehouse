package coe528.project;

public class Pending extends Shipper {

    protected int ExpShip = 3;

    protected Pending(String name, String location) {
        super(name, location);
    }

    protected String ShippingTimes() {
        return "Pending";
    }




}
