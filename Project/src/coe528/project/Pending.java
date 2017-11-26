package coe528.project;

public class Pending extends Shipper {
    /**
     * OVERVIEW: This class extends shipper and is the default status for all orders when they are created. 
     */

    private static int ExpShip = 360; //Just meant to be longest time for shipping.

    public Pending(String name, String location) {
        /**
        * REQUIRES: string name and location  
        * MODIFIES: 
        * EFFECTS: takes the name and location and passes to the super class Shipper. 
        */
        super(name,location,ExpShip);
    }

    protected static String ShippingTimes() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the shipping time.  
        */
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
