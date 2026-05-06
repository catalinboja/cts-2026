package ro.ase.csie.cts.patterns.flyweight;

public class TestGame {

	public static void main(String[] args) {
		
		IScreenObject tree1 = new ScreenObject(ModelType.TREE);
		IScreenObject tree2 = new ScreenObject(ModelType.TREE);
		IScreenObject tree3 = new ScreenObject(ModelType.TREE);
		
		tree1.display(10, 10, 5, "Green");
		tree2.display(100, 23, 5, "Light Green");
		tree3.display(200, 25, 50, "Green");
		
	}

}
