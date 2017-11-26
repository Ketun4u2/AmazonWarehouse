package coe528.project;

public class SameDay extends Priority {
    //Allows canceling the order before it is shipped.

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
