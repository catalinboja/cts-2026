package ro.ase.csie.cts.patterns.flyweight;

public class SpriteFlyweight implements SpriteFlyweightActions{
	
	private String modelName;
	private Model3D model;
	
	public SpriteFlyweight(String modelName) {
		this.modelName = modelName;
		this.model = ModelsFactory.getModel(modelName);
	}
	

	@Override
	public void displayOnScreen(int xCoordinate, int yCoordinate, String textureColor) {
		System.out.println("Displaying " + this.modelName + " at " + 
				xCoordinate + ":" + yCoordinate);
		System.out.println("Use color: " + textureColor);
		System.out.println("Rendering 3d model");
	}

}
