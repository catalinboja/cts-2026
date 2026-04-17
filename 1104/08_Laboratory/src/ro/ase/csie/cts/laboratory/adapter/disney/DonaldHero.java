package ro.ase.csie.cts.laboratory.adapter.disney;

public class DonaldHero implements IDisneyHero{

	@Override
	public void run(int length) {
		System.out.println("Donald is running for " + length);
	}

	@Override
	public void reducePoints() {
		System.out.println("Donald is losing points");
	}

	@Override
	public void chengeColor(String newColor) {
		System.out.println("Donald changes the color to " + newColor);
	}

}
