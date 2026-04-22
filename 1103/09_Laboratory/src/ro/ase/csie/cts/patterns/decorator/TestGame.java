package ro.ase.csie.cts.patterns.decorator;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractAcmeHero superman = new AcmeHero("Superman");
		AbstractAcmeHero batman = new AcmeHero("Batman");
		
		superman.walk();
		batman.walk();
		
		superman = new WoundedHeroDecorator(superman);
		superman.walk();
		superman = new ShieldDecorator(superman, 10);
		superman.walk();
		superman.takeAHit(15);
		superman.takeAHit(5);
		
	}

}


