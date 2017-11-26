package coe528.project;

public class FedEX extends Shipper {
    /**
     * OVERVIEW: This class extends shipper and holds the relevant information for FedEx. 
     */
    protected static int ExpShip = 60;

    public FedEX(String name, String location) {
        /**
        * REQUIRES: string name and location  
        * MODIFIES: 
        * EFFECTS: takes the name and location and passes to the super class Shipper. 
        */
        super(name, location, ExpShip);
    }

    @Override
    protected String shipperName() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the shipping company name.   
        */
        return "FedEX";
    }

    protected static String ShippingTimes() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the shipping time.  
        */
        return "2 to 3 Days Shipping";
    }
}
