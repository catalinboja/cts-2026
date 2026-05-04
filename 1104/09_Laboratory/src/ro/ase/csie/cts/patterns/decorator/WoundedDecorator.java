package ro.ase.csie.cts.patterns.decorator;

public class WoundedDecorator extends AbstractDecorator{

	public WoundedDecorator(AbstractHero hero) {
		super(hero);
	}

	@Override
	public void move(int distance) {
		System.out.println(this.originalHero.getName() + 
				" is crawling for " + distance/2);
	}

	@Override
	public void takeAHit(int points) {
		//call the original action
		this.originalHero.takeAHit(points);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.originalHero.getName();
	}

}
