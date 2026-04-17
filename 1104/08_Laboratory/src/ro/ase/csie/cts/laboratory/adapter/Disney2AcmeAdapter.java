package ro.ase.csie.cts.laboratory.adapter;

import ro.ase.csie.cts.laboratory.adapter.disney.IDisneyHero;

public class Disney2AcmeAdapter extends AcmeAbstractHero {
	
	private IDisneyHero disneyHero;
	
	public Disney2AcmeAdapter(IDisneyHero disneyHero) {
		this.disneyHero = disneyHero;
	}

	@Override
	public void walk() {
		this.disneyHero.run(10);
	}

	@Override
	public void takeAHit(int points) {
		this.disneyHero.reducePoints();
		this.stamina -= points;
	}
	
}
