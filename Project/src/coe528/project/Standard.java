package coe528.project;

public class Standard extends Priority {
    /**
     * OVERVIEW: This class extends priority and holds the relevant information for Standard shipping including liability and cancellation.  
     */
    //Allows canceling the order before it is shipped.

    public Standard() {
        super();
    }

    @Override
    protected boolean cancel() {
        return ship.shipperName().equals("Pending");
    }

    @Override
    protected void setShipper(Shipper ship) {
        super.setShipper(ship);
    }

    @Override
    protected String priorityName() {
        return "Standard";
    }

    @Override
    protected String liability() {
        return "Standard Coverage of $100";
    }

    @Override
    protected String retrn() {
        return "Standard Shipping Charges for Returns";
    }
}
