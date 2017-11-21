/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;


import java.lang.reflect.*;
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
    private String Descrpt;         //optional
    private String name;            //Required for show
    private String location;        //Required for show
    
    private Date date;              //The Date
    
    private Priority pri;                 //IMPORTANT
  

    public Order(int itemnbr, String name, String location, String pri) {
        count++;
        orderNumber = count;
        itemNumber =itemnbr;
        this.name = name;
        this.location = location;
        
        date = new Date();

        this.setPri(pri);

        System.out.println("Your order number is: " + orderNumber);

    }

    //An optional constructor with description
    public Order(int itemnbr, String name, String location, String pri, String des) {
        this(itemnbr, name, location, pri);
        Descrpt = des;
    }


    protected void setPri(String name) {
        name = "coe528.project." + name;
        try {
            Class c = Class.forName(name);
            Constructor<?> ctor = c.getConstructor();
            Priority instance = (Priority) ctor.newInstance();
            this.pri = instance;
           
        } catch (Exception e) {
            System.out.println("Sorry, something happened. But here's the details:");
            System.err.println(e);
        }
    }

    protected void setShip(String name) {
        name = "coe528.project." + name;
        try {
            Class c = Class.forName(name);
            Constructor<?> ctor = c.getConstructor(String.class, String.class);
            Shipper instance = (Shipper) ctor.newInstance(this.name,location);
            pri.setShipper(instance);
            
        } catch (Exception e) {
            System.out.println("Sorry, something happened. But here's the details:");
            System.err.println(e);
        }
    }
    
    
    protected String ETA() {
        return pri.ETA();
    }


}
