/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.project;

/**
 *
 * @author Ketun
 */
    public class TwoDays extends Priority {
    /**
     * OVERVIEW: This class extends priority and holds the relevant information for 2Days shipping including liability and cancellation.  
     */
    //Does not allow cancelling of Order.

    public TwoDays() {
        super();
    }

    @Override
    protected boolean cancel() {
        return false;
    }

    @Override
    protected void setShipper(Shipper ship) {
        super.setShipper(ship);
    }

    @Override
    protected String priorityName() {
        return "2Days";
    }

    @Override
    protected String liability() {
        return "Standard Coverage of $1000";
    }

    @Override
    protected String retrn() {
        return "Free Returns";
    }
}
    

