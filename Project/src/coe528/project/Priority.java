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
 * Actual Use:
 * Cancel Policy
 * 
 * For Show:
 * Liability
 * Return
 * Price
 * 
 */
public abstract class Priority {
    protected Shipper ship;     //The Aggregation making the bridge
    protected boolean shipped;  //Should be set to true upon obtaining a Shipper
    protected boolean canc;     //Handled by the child classes



    public Priority() {
        shipped = false;
    }       //The Constructor must include A shipper object in the constructor.


    protected abstract boolean cancel();        //Can the order be cancelled, real method


    protected abstract String liability() ;     //The Liabililty Cover, a show method


    protected abstract String retrn();          //The return policy, a show method


    protected void setShipper(Shipper ship) {   //Setting a Shipper
        this.ship = ship;
        shipped = true;
    }


    protected String ETA() {                    //Returns Expected Time to Arrival
        if((ship!=null)) {
            return ship.ETA();

        }
        return "Shipment Pending";
    }
    
    protected String ShipmentCreated() {        //Date Shipment was Created
        if(ship!=null) {
            return ship.ShipmentCreated();
        } 
        return "Shipment Pending";
    }

    protected abstract String priorityName();      //Name of the priority

    protected String shipperName() {                //Name of Shipment Provider
        return ship.shipperName();
    }

    protected String shipmentStatus() {
        if(ship.getClass().equals("Pending")) {
            return "Shipment Pending";
        }

        return "Shipped";
    }


}
