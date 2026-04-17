package ro.ase.csie.cts.laboratory.factory;

public class StaffFactory {
	public static AbstractRestaurantStaffAccount getStaff(
			StaffType type, String name) {
		switch(type) {
		case WAITER:
			//return new Waiter();
			return new Waiter(name);
		case CHEF:
			//return new Chef("John Doe");
			return new Chef(name);
		case CASHIER:
			return new Cashier(name);
		default:
			throw new UnsupportedOperationException();	
		}
	}
}
