/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.time.LocalDateTime;

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
    //The Important stuff for shipping. Weight can be changed, its not to important a factor, but we need something to
    //make the actual shippers interesting and not just empty class shells.
    private static int count;
    private int orderNumber;
    private int itemNumber;
    private double weight;

    //Just Extra stuff we could potentially play with.
    private String time;
    private String Descrpt;
    private String name;
    private String location;

    //The priority object, which will have the same problem described in the Priority.java file. Check the comments there. 

    private Priority pri;



    public Order(int itemnbr, double weight, String name, String location) {
        //time = LocalDateTime.now();
        itemNumber =itemnbr;
        this.weight = weight;
        this.name = name;
        this.location = location;



    }

    //An optional constructor with description
    public Order(int itemnbr, double wgt, String name, String location, String des) {
        this(itemnbr, wgt, name, location);
        Descrpt = des;
    }






}