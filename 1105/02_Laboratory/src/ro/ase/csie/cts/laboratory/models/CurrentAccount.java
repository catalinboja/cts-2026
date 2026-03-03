package ro.ase.csie.cts.laboratory.models;

import ro.ase.csie.cts.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.laboratory.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{
	
	public CurrentAccount(String iban) {
		super(iban);
	}

	protected static final double MAX_CREDIT = 5000;

	@Override
	public void deposit(double amount) {
		if(this.balance + amount > 2 * CurrentAccount.MAX_CREDIT)
			throw new IllegalTransferException();
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount < 0)
			throw new InsufficientFundsException();	
		this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}

}
