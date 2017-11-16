package coe528.project;

public class StandardPri extends Priority {

    public StandardPri(Shipper ship) {
        super(ship);
    }

    @Override
    protected boolean cancel() {
        return true;
    }

    @Override
    protected String liability() {
        return "Default Coverage of $100";
    }

    @Override
    protected String retrn() {
        return "Standard Shipping Charges for returns";
    }
}
