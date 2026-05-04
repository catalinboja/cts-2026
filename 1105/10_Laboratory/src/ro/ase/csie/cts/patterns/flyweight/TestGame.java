package ro.ase.csie.cts.patterns.flyweight;

public class TestGame {

	public static void main(String[] args) {
		
		CharacterFlyweight building1 = new CharacterFlyweight("Building#1");
		CharacterFlyweight building2 = new CharacterFlyweight("Building#1");
		CharacterFlyweight building3 = new CharacterFlyweight("Building#1");
		
		building1.displayOnScreen(10, 10, 05, "Grey");
		building2.displayOnScreen(20, 20, 100, "Green");
		building3.displayOnScreen(100, 20, 56, "Green");
		
		
	}

}
