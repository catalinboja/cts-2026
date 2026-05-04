package ro.ase.csie.cts.patterns.decorator;

public abstract class AbstractHero {
	protected String name;
	protected int stamina;
	
	public AbstractHero(String name) {
		this.name = name;
		this.stamina = 100;
	}
	
	public abstract void move(int distance);
	public abstract void takeAHit(int points);

}
