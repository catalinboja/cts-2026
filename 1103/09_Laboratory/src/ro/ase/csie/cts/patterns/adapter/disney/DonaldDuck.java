package ro.ase.csie.cts.patterns.adapter.disney;

public class DonaldDuck implements IDisneyHero{

	@Override
	public void run(int distance) {
		System.out.println("Donald runs for " + distance);
	}

	@Override
	public void changeColor(String newColor) {
		System.out.println("Donald new color is " + newColor);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Donald";
	}
	
}
