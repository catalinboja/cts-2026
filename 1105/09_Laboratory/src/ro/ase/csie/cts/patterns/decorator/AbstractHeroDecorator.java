package ro.ase.csie.cts.patterns.decorator;

public abstract class AbstractHeroDecorator extends AbstractHero {

	AbstractHero originalHero;
	
	public AbstractHeroDecorator(AbstractHero originalHero) {
		super(originalHero.name);
		this.originalHero = originalHero;
	}
	
}
