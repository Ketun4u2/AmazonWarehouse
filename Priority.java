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
    private Shipper ship;

    protected abstract boolean cancel();
    protected abstract String liability() ;
    protected abstract String retrn();
    
    //A Problem occurs here, by default we set the shippper to pending and thats fine. However, when we declare a shipper,
    //we have to do so with an object of the class. So lets say we want to make shipper "FedEx", then we have to make a new object
    //of type FedEx, and we have to set it through some method. 
    
    //The problem is, that in one of the other classes, were going to need a switch loop that takes the shipping provider name and
    //creates the corresponding object for it. This almost defeates the purpose of using the bridge class. 
    
    //Potential Solution: If we could literally create a class based on the user input, instead of going through a switch loop, then this 
    // would be amazing. However, I'm not sure how to do this and it may not even be possible. But lets hope so! 
    
    
}
