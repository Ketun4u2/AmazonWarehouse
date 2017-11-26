package coe528.project;

public class CanadaPost extends Shipper {
    /**
     * OVERVIEW: This class extends shipper and holds the relevant information for CanadaPost. 
     */

    protected static int ExpShip = 120;

    public CanadaPost(String name, String location) {
        /**
        * REQUIRES: string name and location  
        * MODIFIES: 
        * EFFECTS: takes the name and location and passes to the super class Shipper. 
        */
        super(name, location, ExpShip);
    }

    protected static String ShippingTimes() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the shipping time.  
        */
        return "5 Days Shipping";
    }

    protected String shipperName() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the shipping company name.   
        */
        return "CanadaPost";
    }

}
