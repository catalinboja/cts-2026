package ro.ase.csie.cts.laboratory.adapter.disney;

public interface IDisneyHero {
	public abstract void moveOnScreen(int length);
	public abstract void loosePoints(int points);
	public abstract void changeColor(String color);
}
