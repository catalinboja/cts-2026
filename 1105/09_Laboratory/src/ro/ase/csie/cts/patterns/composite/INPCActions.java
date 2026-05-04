package ro.ase.csie.cts.patterns.composite;

public interface INPCActions {
	public abstract void move();
	public abstract void attack(String hero);
	public abstract int getAttackStrength();
}
