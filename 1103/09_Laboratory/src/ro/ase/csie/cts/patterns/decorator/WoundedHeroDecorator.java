package ro.ase.csie.cts.patterns.decorator;

public class WoundedHeroDecorator extends AbstractHeroDecorator{

	public WoundedHeroDecorator(AbstractAcmeHero decoratedHero) {
		super(decoratedHero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println(this.decoratedHero.name + " is crawling");
	}

	@Override
	public void takeAHit(int points) {
		this.decoratedHero.takeAHit(points);
	}

}
