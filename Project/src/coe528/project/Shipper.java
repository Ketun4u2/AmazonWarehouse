/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

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

    private String name ;
    private String location;
    private String time;
    private String date;

    protected Shipper() {}
    protected Shipper(String name,String location) {
        this.name = name;
        this.location = location;
    }
    //What are the expected Shipping times?

    protected String ShippingTimes() {
        return null;
    }

    //Time for specific package
    abstract protected int toShip();

}