package ro.ase.csie.cts.laboratory.factory;

public class TestStaff {

	public static void main(String[] args) {
		AbstractRestaurantStaffAccount waiter1 = 
				StaffFactory.getStaff(StaffType.WAITER, "John");
		waiter1.describeRole();
		AbstractRestaurantStaffAccount chef1 = 
				StaffFactory.getStaff(StaffType.CHEF, "Alice");
		chef1.describeRole();
	}

}
