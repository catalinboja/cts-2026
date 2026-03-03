package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.interfaces.Profitable;

public class SavingsAccount extends BankAccount implements Profitable{

	private static final double MIN_BALANCE = 100;
	
	protected SavingsAccount(String iban) {
		super(iban);
		this.balance = SavingsAccount.MIN_BALANCE;
	}

	@Override
	public void addInterest(float interestPercentage) {
		this.balance += (this.balance * interestPercentage / 100);
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
