package ro.ase.csie.cts.patterns.strategy;

public class PayByCardProcessor implements IPaymentProcessor{

	@Override
	public void pay(String username, double amount) {
		System.out.println("Pay by card :" + amount + 
				"  for player " + username);
	}

}
