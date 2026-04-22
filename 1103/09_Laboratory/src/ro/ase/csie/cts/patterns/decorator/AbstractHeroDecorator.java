package ro.ase.csie.cts.patterns.decorator;

public abstract class AbstractHeroDecorator extends AbstractAcmeHero{

	protected AbstractAcmeHero decoratedHero;
	
	public AbstractHeroDecorator(AbstractAcmeHero decoratedHero) {
		this.decoratedHero = decoratedHero;
	}
	
}
