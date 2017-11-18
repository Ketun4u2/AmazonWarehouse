/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.time.*;
import java.time.format.DateTimeFormatter;

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
    //Requires: All subclasses declare a value for ExpShip
    protected int ExpShip = 0;                   //The shipping time for the provider. Very Important

    private String name ;
    private String location;

    private ZonedDateTime Shiptime;         //Set on instantiation
    private ZonedDateTime Arritime;         //Shiptime + ExpTime to Ship


    protected Shipper(String name,String location) {
        this.name = name;
        this.location = location;
        Shiptime = ZonedDateTime.now();
        Arritime = Shiptime;
    }

    protected Shipper(String name, String location, int ExpS) {
        this(name, location);
        Arritime.plusHours(ExpS);

    }

    //What are the expected Shipping times? Just a String Representation
    //Just a general representation, should be static in the concrete class
    abstract protected String ShippingTimes() ;


    //The actual Time for specific package
    protected String ETA() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:00");
        return (Arritime.format(dtf));
    }



}