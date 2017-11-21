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


    //The Constructor must include A shipper object in the constructor.
    public Priority() {
        shipped = false;
    }

    //Can the order be cancelled, real method
    protected abstract boolean cancel();

    //The Liabililty Cover, a show method
    protected abstract String liability() ;

    //The return policy, a show method
    protected abstract String retrn();

    //Setting a Shipper 
    protected void setShipper(Shipper ship) {
        this.ship = ship;
        shipped = true;
    }

    //Returns Expected Time to Arrival
    protected String ETA() {
        if(ship!=null) {
            return ship.ETA();
        }
        return "Pending";
    }


}
