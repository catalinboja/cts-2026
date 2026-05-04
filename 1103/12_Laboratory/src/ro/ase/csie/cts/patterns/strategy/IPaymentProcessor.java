package ro.ase.csie.cts.patterns.strategy;

public interface IPaymentProcessor {
	public abstract void pay(String username, double amount);
}
