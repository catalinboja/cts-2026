package ro.ase.csie.cts.models;

import java.util.ArrayList;

import ro.ase.csie.cts.models.enums.AccountType;

public class Bank {
	
	private String name;
	private int nextId = 1;
	//eager instantiation
	private ArrayList<BankAccount> accounts = new ArrayList<>();
	
	public Bank(String name) {
		super();
		this.name = name;
	}
	
	public BankAccount openAccount(AccountType type) {
		switch(type) {
		case CURRENT:
			CurrentAccount current = new CurrentAccount(
					this.name + "-" + nextId);
			this.accounts.add(current);
			this.nextId += 1;
			return current;
		case SAVINGS:
			SavingsAccount savings = new SavingsAccount(this.name + "-" + nextId);
			this.accounts.add(savings);
			this.nextId += 1;
			return savings;
		default:
			throw new UnsupportedOperationException("Account type not covered!");
		}
	}

}






