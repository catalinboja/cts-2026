package ro.ase.csie.cts.patterns.flyweight;

public class ScreenObject implements IScreenObject{
	
	private ModelType type;
	private Model3D model;
	
	public ScreenObject(ModelType type) {
		this.type = type;
		this.model = Models3DFactory.getModel(type);
	}
		

	@Override
	public void display(int x, int z, int y, String color) {
		System.out.println("Rendering on screen model for  " + this.type);
		System.out.println("At coordinates " + 
				String.format("%d, %d, %d", x, z, y) 
				+ " with color " + color);
		System.out.println("Generating model based on " + 
				this.model.points.size() + " points");
		
	}

}
