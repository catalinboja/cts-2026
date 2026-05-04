package ro.ase.csie.cts.patterns.decorator;

public class ShieldDecorator extends AbstractDecorator{
	
	protected int shieldStrength;

	public ShieldDecorator(AbstractHero hero, int strength) {
		super(hero);
		this.shieldStrength = strength;
	}

	@Override
	public void move(int distance) {
		this.originalHero.move(distance);
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.originalHero.getName() + " uses a shield");
		if(this.shieldStrength > points) {
			System.out.println("Not affected");
		} else {
			this.originalHero.stamina -= (points - this.shieldStrength);
			System.out.println("Loses " + (points - this.shieldStrength) + " points");
		}
		//this.originalHero.takeAHit(points);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.originalHero.getName();
	}

}





