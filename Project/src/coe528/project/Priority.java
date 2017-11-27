/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 *
 * @author k79patel
*/

public abstract class Priority {
    /**
     * OVERVIEW: This abstract class provides all the parameters of priority of the order.  
     */

    protected Shipper ship;     //The Aggregation making the bridge

    public Priority() {}      

    protected abstract boolean cancel();        //Can the order be cancelled

    protected abstract String liability();     //The Liabililty Policy

    protected abstract String retrn();          //The return policy
    
    protected abstract String priorityName();      //Name of the priority


    protected void setShipper(Shipper ship) {   //Setting a Shipper
        this.ship = ship;
    }

    protected String shipperName() {                //Name of Shipment Provider
        return ship.shipperName();
    }
    
    protected String ETA() {                    //Returns Expected Time to Arrival
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the expected time of arrival of order. 
        */
        if ((ship != null)) {
            return ship.ETA();
        }
        return "Shipment Pending";
    }

    protected String ShipmentCreated() {        //Date Shipment was Created
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the status that shipment is pending if the order hasn't been shipped otherwise it gives order created date.
        */
        if (shipperName().equals("Pending")) {
            return "Shipment Pending";
        }
        return ship.ShipmentCreated();

    }

    protected String shipmentStatus() {
        /**
        * REQUIRES:   
        * MODIFIES: 
        * EFFECTS: Returns the status that shipment is pending if the order hasn't been shipped otherwise it says Shipped. 
        */
        if (ship.getClass().equals("Pending")) {
            return "Shipment Pending";
        }
        return "Shipped";
    }
}
