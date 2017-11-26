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
    /**
     * OVERVIEW: Provides a basic structure for orders and all its parameters. 
     */
    private static int count;
    private int orderNumber;

    private int itemNumber;

    private String name;            //Required for show
    private String location;        //Required for show

    private String pri;             //Will be used to store to file
    private String shi;             //Will be used to store to file
    
    private Date date;              //The Date
    
    private Priority priority;                 //IMPORTANT


    public Order(int itemnbr, String name, String location, String pri) {
        /**
        * REQUIRES: name, location and pri all have to be string and itemnbr to be a positive number.
        * EFFECTS: Takes all the required inputs from the customer and assigns them to their respective parameter and returns an order number.
        */
        count++;
        orderNumber = count;
        itemNumber =itemnbr;
        this.pri = pri;
        shi = "Pending";
        this.name = name;
        this.location = location;
        
        date = new Date();

        this.setPriority(pri);
        this.setShip("Pending");

        System.out.println("Your order number is: " + orderNumber);

    }


    protected void setPriority(String name) { 
         /**
        * REQUIRES: name must be a string chosen from four types of priority available. 
        * EFFECTS: Takes the given priority and assigns it to that specific order. 
        */
        pri = name;
        name = "coe528.project." + name;
        try {
            Class c = Class.forName(name);
            Constructor<?> ctor = c.getConstructor();
            Priority instance = (Priority) ctor.newInstance();
            this.priority = instance;
           
        } catch (Exception e) {
            System.out.println("Sorry, something happened. But here's the details:");
            System.err.println(e);
        }
    }

    protected void setShip(String name) {
        /**
        * REQUIRES: name must be a string chosen from three types of shipping companies available. 
        * EFFECTS: Replaces the default the given shipper from default to the new shipper assigned by the employee.
        */
        shi = name;
        name = "coe528.project." + name;
        try {
            Class c = Class.forName(name);
            Constructor<?> ctor = c.getConstructor(String.class, String.class);
            Shipper instance = (Shipper) ctor.newInstance(this.name,location);
            priority.setShipper(instance);
            
        } catch (Exception e) {
            System.out.println("Sorry, something happened. But here's the details:");
            System.err.println(e);
        }
    }
    
    protected int getOrderNumber() {            //Returns Order Number
        return orderNumber;
    }
    
    protected String getPriority() {            //Returns Prioirty Name
        return pri;
    }
    
    protected String getShipper() {             //Returns Shipper Name
        return shi;
    }
    
    protected boolean canCancel() {              //Can the Order be Cancelled
        return priority.cancel();
    }
    
    protected String ETA() {                            //ETA to Delivery
        return priority.ETA();
    }
    
    protected String ShipmentCreated() {                //Date Shipment Created
        return priority.ShipmentCreated();
    }
    
        
    protected void ShippingDetails() {  
        /**
        * EFFECTS: Combines all the information of a specific order and prints it. 
        */
 
        System.out.println("Order Date: " + date);
        System.out.println("Item #" + itemNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + location);

        System.out.println("Shipping Priority: " + priority.priorityName());
        System.out.println("Shipment Provider: " + priority.shipperName());

        System.out.println("Shipment Created: " + ShipmentCreated());
        System.out.println("Expected Delivery Date: " + ETA());
        
    }
    


}
