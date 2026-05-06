package ro.ase.csie.cts.patterns.strategy;

public class UserAccount {
	
	private String username;
	private IPaymentStrategy paymentSolution;
	
	public UserAccount(String user) {
		this.username = user;
	}
	
	public void setPaymentMode(IPaymentStrategy paymentSolution) {
		this.paymentSolution = paymentSolution;
	}
	
	public void paySubscription(double value) {
		System.out.println("Processing payment....");
		if(this.paymentSolution != null) {
			//callback to the real implementation
			this.paymentSolution.pay(value);
		} else {
			throw new UnsupportedOperationException();
		}
	}
	

}
