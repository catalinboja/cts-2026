package ro.ase.csie.cts.patterns.strategy;

public class TestGame {

	public static void main(String[] args) {
		
		UserAccount account = new UserAccount("John");
		
		IPaymentStrategy currentPaymentMode = new PayByCardStrategy("VISA");
		
		account.setPaymentMode(currentPaymentMode);
		account.paySubscription(100);
		
		currentPaymentMode = new PayByPaypalStrategy();
		
		account.setPaymentMode(currentPaymentMode);
		account.paySubscription(100);
		
		account.setPaymentMode(new PayByCardStrategy("VISA"));
		account.paySubscription(100);
		
	}

}
