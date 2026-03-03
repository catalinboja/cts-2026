package ro.ase.csie.cts.models;

import ro.ase.csie.cts.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsException;
	public abstract double getBalance();
}
