package ro.ase.csie.cts.patterns.decorator;

public class WoundedDecorator extends AbstractHeroDecorator{

	public WoundedDecorator(AbstractHero originalHero) {
		super(originalHero);
	}

	@Override
	public void move(int distance) {
		System.out.println(this.originalHero.name + 
				" is crawling for " + distance/2);
	}

	@Override
	public void takeAHit(int points) {
		this.originalHero.takeAHit(points);
	}
	
	

}
