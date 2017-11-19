/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

import java.time.*;
import java.time.format.*;
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
    protected Shipper ship;
    protected boolean shipped;
    protected boolean canc;   //Handled by the child classes


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

    protected void setShipper(Shipper ship) {
        this.ship = ship;
        shipped = true;
    }

    //These two methods, ShippingTimes and ETA, are almost redundant.
    //The idea was ShippingTimes was to see an average estimate for shipping
    //While ETA estimated time of arrival.

    protected String ETA() {
        if(ship!=null) {
            return ship.ETA();
        }
        return "Pending";
    }


}


//A Problem occurs here, by default we set the shippper to pending and thats fine. However, when we declare a shipper,
//we have to do so with an object of the class. So lets say we want to make shipper "FedEx", then we have to make a new object
//of type FedEx, and we have to set it through some method.

//The problem is, that in one of the other classes, were going to need a switch loop that takes the shipping provider name and
//creates the corresponding object for it. This almost defeates the purpose of using the bridge class.

//Potential Solution: If we could literally create a class based on the user input, instead of going through a switch loop, then this
// would be amazing. However, I'm not sure how to do this and it may not even be possible. But lets hope so!
