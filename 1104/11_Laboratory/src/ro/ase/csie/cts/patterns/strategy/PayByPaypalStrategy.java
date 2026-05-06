package ro.ase.csie.cts.patterns.strategy;

public class PayByPaypalStrategy implements IPaymentStrategy{


	@Override
	public void pay(double amount) {
		System.out.println("Pay using PayPal");
	}

}
