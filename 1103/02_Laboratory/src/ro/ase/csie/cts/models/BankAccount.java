package ro.ase.csie.cts.models;

public abstract class BankAccount extends Account{

	protected double balance;
	protected final String iban;
	
	protected BankAccount(String iban) {
		this.iban = iban;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

}
