/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;


import java.lang.reflect.Constructor;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author k79patel
 */
/*
 * Aggregates the Shipment Details:
 * Priority
 * Shipper
 * 
 * Contain all order details:
 * Order Number
 * Weight
 * Shipping Priority
 * 
 * 
 * For Show:
 * Name
 * Shipment Details
 * Time
 * Expected Delivery
 * 
 * 
 * 
 *
 */


public class Order {
    //The Important stuff for shipping. we need something to
    //make the actual shippers interesting and not just empty class shells.
    private static int count;
    private int orderNumber;

    private int itemNumber;         //Just for show.
    //private double weight;

    //Just Extra stuff we could potentially play with. Inner workings to make it cool and actually do something
    private String time;            //Just a string representation of time, not necessary but makes life easy
    private String Descrpt;          //optional
    private String name;            //Required for show
    private String location;        //Required for show

    //We can use reflection to set priority later on by the employee.
    private Priority pri;                 //IMPORTANT
    private ZonedDateTime date;           //The variable that actually contains all date info



    public Order(int itemnbr, String name, String location, String pri) {
        count++;
        orderNumber = count;
        itemNumber =itemnbr;
        this.name = name;
        this.location = location;

        //To Set the Time
        ZonedDateTime date = ZonedDateTime.now();
        time  = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm").format(date);

        //Now to Initialize a concrete priority class based on the user input string.

        System.out.println("Your order number is: " + orderNumber);

    }

    //An optional constructor with description
    public Order(int itemnbr, String name, String location, String pri, String des) {
        this(itemnbr, name, location, pri);
        Descrpt = des;
    }


    protected String ETA() {
        return pri.ETA();
    }


    protected void setPri(Priority pri) {
        this.pri = pri;
    }
/*
    //This should take a string and instantiate it. but that's for later implementation if time permits
    protected void setShi(Shipper ship) {
        //create an object based on string input
        Shipper test = new Pending(name, location);
        pri.setShipper(test);
    }
*/
    protected void setShip(String name) {
        try {
            Class c = Class.forName(name);
            System.out.println(c.getCanonicalName());
            Constructor ctor = c.getConstructor(String.class, String.class);
            Shipper instance = (Shipper) ctor.newInstance(name,location);
            pri.setShipper(instance);
        } catch (Exception e) {
            System.out.println("Sorry, this class probably doesn't exist. But here's the details:");
            System.err.println(e);
        }
    }





}