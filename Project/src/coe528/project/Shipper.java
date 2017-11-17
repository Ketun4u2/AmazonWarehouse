/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.time.*;

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
    protected int ExpShip;                   //The shipping time for the provider. Very Important

    private String name ;
    private String location;

    private ZonedDateTime Shiptime;         //Set on instantiation
    private ZonedDateTime Arritime;         //Shiptime + ExpTime to Ship


    protected Shipper(String name,String location) {
        this.name = name;
        this.location = location;
        Shiptime = ZonedDateTime.now();
        Arritime = Shiptime;
        Arritime.plusHours(ExpShip);
    }

    //What are the expected Shipping times? Just a
    abstract protected String ShippingTimes() ;

    //Time for specific package
    protected ZonedDateTime ETA() {
        return Arritime;
    }



}