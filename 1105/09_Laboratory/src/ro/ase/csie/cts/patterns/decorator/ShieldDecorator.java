package ro.ase.csie.cts.patterns.decorator;

public class ShieldDecorator extends AbstractHeroDecorator{

	int shieldStrength;
	
	public ShieldDecorator(AbstractHero originalHero, int shieldStrength) {
		super(originalHero);
		this.shieldStrength = shieldStrength;
	}

	@Override
	public void move(int distance) {
		this.originalHero.move(distance);
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.originalHero.name + " uses the shield");
		if(this.shieldStrength > points) {
			System.out.println("No damage done");
		}
		else {
			this.stamina -= (points - this.shieldStrength);
			System.out.println("Loses only " + 
			(points-this.shieldStrength));
		}
	}

}
