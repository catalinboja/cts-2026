package ro.ase.csie.cts.laboratory.exceptions;

//define a custom checked exception
public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException(final String msg) {
		super(msg);
	}
	
	public InsufficientFundsException() {
		
	}
}
