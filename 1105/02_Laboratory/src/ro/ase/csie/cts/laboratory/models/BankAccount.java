package ro.ase.csie.cts.laboratory.models;

public abstract class BankAccount extends Account{
	protected double balance;
	protected String iban;
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	
	protected BankAccount(String iban) {
		this.iban = iban;
	}

	
}
