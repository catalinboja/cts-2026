package ro.ase.csie.cts.laboratory.models;

import java.util.ArrayList;

import ro.ase.csie.cts.laboratory.enums.AccountType;

public class Bank {
	private String name;
	private int nextId = 0;
	private ArrayList<BankAccount> accounts = new ArrayList<>();
	
	public Bank(String name) {
		this.name = name;
	}
	
	public BankAccount openAccount(AccountType type) {
		
		if(this.accounts  == null)
			this.accounts = new ArrayList<BankAccount>();
		
		switch(type) {
		case SAVINGS:
			this.nextId += 1;
			SavingsAccount acc = new SavingsAccount(name + " - " + this.nextId);
			this.accounts.add(acc);
			return acc;
		case CURRENT:
			this.nextId += 1;
			CurrentAccount current = new CurrentAccount(name + " - " + this.nextId);
			this.accounts.add(current);
			return current;
		default:
			throw new UnsupportedOperationException("AccountType not handled");
		}
	}
	
	
}
