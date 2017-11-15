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

    protected abstract String ShipRange();
    protected abstract int toShip() ;
    
}
