/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.util.*;


/**
 *
 * @author k79patel
 */

public abstract class Shipper {
    /**
     * OVERVIEW: This abstract class states all the methods required for each shipping company and it assigns each order a shipping company. 
     *
     *
     */
    
    //Requires: All subclasses declare a value for ExpShip. This is the
    //shipping time of the provider. Very Important
    protected int ExpShip = 0;   
    
    private GregorianCalendar shiptime;         //A Calender
    private GregorianCalendar arritime;

    private String name ;           
    private String location;       


    protected Shipper(String name, String location, int ExpS) {
        /**
        * REQUIRES: name and location have to be string and Exps to be a positive number.
        * EFFECTS: Assigns each value to its appropriate variable and add its to the order object. 
        */
        this.name = name;
        this.location = location;
        
        
        shiptime = new GregorianCalendar();
        arritime = new GregorianCalender();
        arritime.add(GregorianCalendar.HOUR, ExpS);
        
    }

    protected String ETA() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the expected delivery time. 
        */
        Date date = arritime.getTime();
        date.setSeconds(0);
        date.setMinutes(0);
        return "" + date;
    }
    
    
    protected String ShipmentCreated() {
        /*
         * Effects: Returns Date Shipment was Created. 
        */
        return "" + shiptime.getTime();
    }

    //To be implemented by the Shipment Providers, naturally. 
    protected abstract String shipperName();

}
