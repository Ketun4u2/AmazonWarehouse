/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 *
 * @author Ketun
 */
public class UPS extends Shipper {
    /**
     * OVERVIEW: This class extends shipper and holds the relevant information for FedEx. 
     */
    protected static int ExpShip = 60;

    public UPS(String name, String location) {
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
        return "UPS";
    }

    protected static String ShippingTimes() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the shipping time.  
        */
        return "10 to 12 Days Shipping";
    }
}

    

