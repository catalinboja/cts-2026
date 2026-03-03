package ro.ase.csie.cts.laboratory.models;

import java.util.ArrayList;

import ro.ase.csie.cts.laboratory.models.enums.AccountType;

public class Bank {
	private String name;
	private int nextId;
	
	//eager approach - create the collection when I defined it
	//alternative is the lazy approach
	ArrayList<BankAccount> accounts = new ArrayList<>();

	public Bank(String name) {
		this.name = name;
	}
	
	public BankAccount openAccount(AccountType type) {
		switch(type) {
			case SAVINGS:
				this.nextId += 1;
				SavingsAccount savings = 
						new SavingsAccount(this.name + "-" + this.nextId);
				this.accounts.add(savings);
				return savings;
			case CURRENT:
				this.nextId += 1;
				CurrentAccount current = 
						new CurrentAccount(this.name + "-" + this.nextId);
				this.accounts.add(current);
				return current;
			default:
				throw new UnsupportedOperationException("Account type not handled");
				
		}
	}
	
}
