package coe528.project;

public class Standard extends Priority {
    //Allows canceling the order before it is shipped.

    public Standard() {
        super();
        super.canc = true;
    }

    @Override
    protected boolean cancel() {
        if (!this.shipped) {
            return true;
        }
        return false;
    }

    @Override
    protected void setShipper(Shipper ship) {
        super.setShipper(ship);
        this.canc = false;
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
