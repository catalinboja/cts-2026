package ro.ase.csie.cts.laboratory.models;

import ro.ase.csie.cts.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.laboratory.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
	
	private static final double MAX_CREDIT = 5000;
	
	public static double getMaxCredit() {
		return CurrentAccount.MAX_CREDIT;
	}

	public CurrentAccount(String iban) {
		super(iban);
	}

	@Override
	public void deposit(double amount) {
		//check if the balance exceeds 2 x max credit line
		if(this.balance + amount > 2 * CurrentAccount.MAX_CREDIT) {
			throw new IllegalTransferException();
		}
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount < 0) {
			throw new InsufficientFundsException("No more credit");
		}
		this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);
	}

}
