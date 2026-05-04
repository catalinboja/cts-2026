package ro.ase.csie.cts.patterns.strategy;

public class UserPaymentService {
	
	String username;
	IPaymentProcessor paymentProcessor;
	
	public UserPaymentService(String user) {
		this.username = user;
	}
	
	public void setPaymentOption(IPaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
	
	public void pay(double subscription) {
		if(this.paymentProcessor != null) {
			//callback the real payment processor
			this.paymentProcessor.pay(this.username, subscription);
		}
		else {
			throw new UnsupportedOperationException();
		}
	}
}
