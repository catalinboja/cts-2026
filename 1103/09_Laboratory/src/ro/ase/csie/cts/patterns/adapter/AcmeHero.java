package ro.ase.csie.cts.patterns.adapter;

public class AcmeHero extends AbstractAcmeHero{
	
	public AcmeHero(String name) {
		this.name = name;
		this.stamina = 100;
	}

	@Override
	public void walk() {
		System.out.println(this.name + " is walking on screen");
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.name + " was hit");
		this.stamina -= points;
	}

}




