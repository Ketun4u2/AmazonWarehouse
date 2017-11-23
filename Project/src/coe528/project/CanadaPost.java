package coe528.project;

public class CanadaPost extends Shipper {

    protected static int ExpShip = 120;

    public CanadaPost(String name, String location) {
        super(name, location, ExpShip);
    }

    protected static String ShippingTimes() {
        return "5 Days Shipping";
    }

    protected String shipperName() {
        return "CanadaPost";
    }

}
