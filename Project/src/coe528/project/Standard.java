package coe528.project;

public class Standard extends Priority {

    public Standard(Shipper ship) {
        super(ship);
    }

    @Override
    //Make sure item is not shipped otherwise we can't return
    protected boolean cancel() {
        if(!this.shipped) return true;
        return false;
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
