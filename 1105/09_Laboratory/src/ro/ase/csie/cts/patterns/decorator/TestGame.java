package ro.ase.csie.cts.patterns.decorator;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractHero superman = new Hero("Superman");
		AbstractHero batman = new Hero("Batman");
		
		superman.move(10);
		batman.move(15);
		superman.takeAHit(5);
		batman.takeAHit(5);
		
		superman = new WoundedDecorator(superman);
		superman.move(10);
		batman.move(15);
		superman.takeAHit(5);
		
		superman = new ShieldDecorator(superman, 10);
		superman.move(10);
		superman.takeAHit(5);
		
	}

}
