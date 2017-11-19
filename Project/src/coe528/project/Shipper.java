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
/*
    protected Shipper(String name,String location) {
        this.name = name;
        this.location = location;
        Shiptime = ZonedDateTime.now();
        Arritime = Shiptime;
    } */

    protected Shipper(String name, String location, int ExpS) {
        this.name = name;
        this.location = location;
        Shiptime = ZonedDateTime.now();
        Arritime = Shiptime;
        Arritime.plusHours((long)ExpS);
    }

    //The actual Time for specific package
    protected String ETA() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy  HH:00");
        return (dtf.format(Arritime));
    }



}

    //Extras

//What are the expected Shipping times? Just a String Representation
//Just a general representation, should be static in the concrete class
//abstract static shippingtimes()
//Of course java doesn't allow abstract static methods, so everyone should just know
//that the children need a concrete implementation of this.


