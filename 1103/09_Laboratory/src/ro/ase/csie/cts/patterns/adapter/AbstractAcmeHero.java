package ro.ase.csie.cts.patterns.adapter;

public abstract class AbstractAcmeHero {
	
	String name;
	int stamina;
	
	public abstract void walk();
	public abstract void takeAHit(int points);
	
}
