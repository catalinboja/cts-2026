package ro.ase.csie.cts.laboratory.adapter;

public abstract class AcmeAbstractHero {

	protected String name;
	protected int stamina;
	
	public abstract void walk();
	public abstract void takeAHit(int points);
}
