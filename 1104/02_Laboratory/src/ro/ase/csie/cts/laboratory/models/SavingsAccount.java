package ro.ase.csie.cts.laboratory.models;

import ro.ase.csie.cts.laboratory.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.laboratory.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable{

	protected static final double MIN_BALANCE = 100;
	
	public SavingsAccount(String iban) {
		super(iban);
		this.balance = SavingsAccount.MIN_BALANCE;
	}

	@Override
	public void addInterest(double interestAbsoluteValue) {
		this.balance += this.balance * interestAbsoluteValue;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount < SavingsAccount.MIN_BALANCE) {
			throw new InsufficientFundsException();
		}
		this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}

}
