package coe528.project;

public class FedEX extends Shipper {
    protected static int ExpShip = 60;

    public FedEX(String name, String location) {
        super(name, location, ExpShip);
    }

    @Override
    protected String shipperName() {
        return "FedEX";
    }

    protected static String ShippingTimes() {
        return "2 to 3 Days Shipping";
    }
}
