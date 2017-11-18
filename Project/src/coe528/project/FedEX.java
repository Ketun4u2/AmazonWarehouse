package coe528.project;

public class FedEX extends Shipper {
    protected int ExpShip = 60;

    protected FedEX(String name, String location, int ExpShip) {
        super(name, location, ExpShip);
    }

    protected String ShippingTimes() {
        return "2 to 3 Days Shipping";
    }
}
