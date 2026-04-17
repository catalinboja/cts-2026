package ro.ase.csie.cts.laboratory.factory;

public abstract class AbstractRestaurantStaffAccount {
    protected String staffName;

    public AbstractRestaurantStaffAccount(String staffName) {
        this.staffName = staffName;
    }

    public abstract void describeRole();
}