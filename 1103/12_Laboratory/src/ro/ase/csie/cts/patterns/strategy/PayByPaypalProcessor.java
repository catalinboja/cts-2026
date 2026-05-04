package ro.ase.csie.cts.patterns.strategy;

public class PayByPaypalProcessor implements IPaymentProcessor{

	@Override
	public void pay(String username, double amount) {
		System.out.println("PayPal payment: " + amount);
	}

}
