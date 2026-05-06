package ro.ase.csie.cts.patterns.strategy;

public class PayByCardStrategy implements IPaymentStrategy{

	private String cardProcessor;
	
	public PayByCardStrategy(String processor) {
		this.cardProcessor = processor;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Pay by card. Processed by " + 
			this.cardProcessor);
	}

}
