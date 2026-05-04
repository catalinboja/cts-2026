package ro.ase.csie.cts.patterns.decorator;

public abstract class AbstractHero {

	protected String name;
	protected int stamina;
	
	public abstract void move(int distance);
	public abstract void takeAHit(int points);
	public abstract String getName();
}
