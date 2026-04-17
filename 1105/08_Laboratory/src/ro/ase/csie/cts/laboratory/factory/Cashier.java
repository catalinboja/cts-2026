package ro.ase.csie.cts.laboratory.factory;

public class Cashier extends AbstractRestaurantStaffAccount{

	public Cashier(String staffName) {
		super(staffName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void describeRole() {
		System.out.println("Cashier");
	}

}
