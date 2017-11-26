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

/*
 * This is the mother container for the shipping companies
 * Ex: Fed EX, UPS...
 * 
 * Contains:
 * Time to Ship
 * 
 */
public abstract class Shipper {
    /**
     * OVERVIEW: This abstract class states all the methods required for each shipping company and it assigns each order its shipping company. 
     */
    //Requires: All subclasses declare a value for ExpShip. This is the
    //Shipping times of the provide. Very Important
    protected int ExpShip = 0;   
    
    private GregorianCalendar shiptime;
    private GregorianCalendar arritime;

    private String name ;           //A Show Variable
    private String location;        //Another Show


    protected Shipper(String name, String location, int ExpS) {
        /**
        * REQUIRES: name and location have to be string and Exps to be a positive number.
        * EFFECTS: Assigns each value to its appropriate variable and add its to the order object. 
        */
        this.name = name;
        this.location = location;
        
        
        shiptime = new GregorianCalendar();
        arritime = shiptime;
        arritime.add(GregorianCalendar.HOUR, ExpS);
        
    }

    //The actual Time for specific package
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
        return "" + shiptime.getTime();
    }

    protected abstract String shipperName();



}

    //Extras

//What are the expected Shipping times? Just a String Representation
//Just a general representation, should be static in the concrete class
//abstract static shippingtimes()
//Of course java doesn't allow abstract static methods, so everyone should just know
//that the children need a concrete implementation of this.


