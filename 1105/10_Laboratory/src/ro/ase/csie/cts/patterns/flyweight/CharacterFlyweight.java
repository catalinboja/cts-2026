package ro.ase.csie.cts.patterns.flyweight;

public class CharacterFlyweight implements CharacterFlyweightInterface {

	Model3D model;
	String name;
	
	public CharacterFlyweight(String name) {
		this.model = ModelsFactory.getModel(name);
		this.name = name;
	}
	
	
	@Override
	public void displayOnScreen(int x, int y, int z, String color) {
		System.out.println("Display on screen model for " + this.model.name);
		// process model points list
		//...
		System.out.println("Apply color: " + color);
		System.out.println("Put in on screen at " + x + ", " + y + ", " + z);
		
	}

}
