package ro.ase.csie.cts.patterns.strategy;

public class TestGame {

	public static void main(String[] args) {
		
		UserPaymentService userService = new UserPaymentService("Alice");
		userService.setPaymentOption(new PayByCardProcessor());
		
		userService.pay(10);
		
		userService.setPaymentOption(new PayByPaypalProcessor());
		userService.pay(10);
		
	}

}
