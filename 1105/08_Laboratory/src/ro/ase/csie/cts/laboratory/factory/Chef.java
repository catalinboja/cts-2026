package ro.ase.csie.cts.laboratory.factory;

public class Chef extends AbstractRestaurantStaffAccount{

	public Chef(String staffName) {
		super(staffName);
	}

	@Override
	public void describeRole() {
		System.out.println("Chef");
	}

}
