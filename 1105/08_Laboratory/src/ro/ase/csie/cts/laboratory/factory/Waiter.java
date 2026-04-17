package ro.ase.csie.cts.laboratory.factory;

public class Waiter extends AbstractRestaurantStaffAccount{

	public Waiter(String staffName) {
		super(staffName);
	}
	
	public Waiter() {
		super("John Doe");
	}

	@Override
	public void describeRole() {
		System.out.println("Waiter");
	}

}
