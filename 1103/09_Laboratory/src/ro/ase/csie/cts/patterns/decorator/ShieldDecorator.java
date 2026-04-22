package ro.ase.csie.cts.patterns.decorator;

public class ShieldDecorator extends AbstractHeroDecorator{

	private int shieldStrength;
	
	public ShieldDecorator(AbstractAcmeHero decoratedHero, int strength) {
		super(decoratedHero);
		this.shieldStrength = strength;
	}

	@Override
	public void walk() {
		this.decoratedHero.walk();
	}

	@Override
	public void takeAHit(int points) {
		System.out.println("Using shield");
		if(points > shieldStrength) {
			this.stamina -= (points - shieldStrength);
			System.out.println("Lose some points");
		}
	}

}
