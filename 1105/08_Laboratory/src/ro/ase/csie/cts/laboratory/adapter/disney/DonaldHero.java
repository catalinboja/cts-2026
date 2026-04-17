package ro.ase.csie.cts.laboratory.adapter.disney;

public class DonaldHero implements IDisneyHero{

	@Override
	public void moveOnScreen(int length) {
		System.out.println("Donald moves for " + length);
	}

	@Override
	public void loosePoints(int points) {
		System.out.println("Donald loses points");
	}

	@Override
	public void changeColor(String color) {
		System.out.println("Donald changes color to " + color);
	}

}
