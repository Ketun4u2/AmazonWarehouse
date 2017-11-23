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
    //Requires: All subclasses declare a value for ExpShip. This is the
    //Shipping times of the provide. Very Important
    protected int ExpShip = 0;   
    
    private GregorianCalendar shiptime;
    private GregorianCalendar arritime;

    private String name ;           //A Show Variable
    private String location;        //Another Show


    protected Shipper(String name, String location, int ExpS) {
        this.name = name;
        this.location = location;
        
        shiptime = new GregorianCalendar();
        arritime = shiptime;
        arritime.add(GregorianCalendar.HOUR, ExpS);
        
    }

    //The actual Time for specific package
    protected String ETA() {
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


