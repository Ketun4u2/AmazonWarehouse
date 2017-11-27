package coe528.project;

public class SameDay extends Priority {
    /**
     * OVERVIEW: This class extends priority and holds the relevant information for SameDay shipping including liability and cancellation.  
     */
    //Does not allow cancelling the Order before shipment. 

    public SameDay() {
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
        return "SameDay";
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
