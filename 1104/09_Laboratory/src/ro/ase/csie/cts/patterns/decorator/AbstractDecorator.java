package ro.ase.csie.cts.patterns.decorator;

public abstract class AbstractDecorator extends AbstractHero{
	protected AbstractHero originalHero;
	
	public AbstractDecorator(AbstractHero hero) {
		this.originalHero = hero;
	}
}
