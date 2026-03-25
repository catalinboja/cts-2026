package ro.ase.csie.cts.design.patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SpaceObject3DModel implements Cloneable{

	String name;
	int memory;
	int[] points;
	ArrayList<Integer> vertices;
	
	public SpaceObject3DModel(String name) throws InterruptedException {
		System.out.println("Init 3d model for " + name);
		this.name = name;
		Thread.sleep(5000);
		Random random = new Random();
		this.memory = random.nextInt(1000);
		this.points = new int[10];
		for(int i = 0; i < 10; i++) {
			this.points[i] = random.nextInt(100);
		}
		this.vertices = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			this.vertices.add(random.nextInt(10000));
		}
		System.out.println("3d model created");
	}
	
	private SpaceObject3DModel() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//don't use that one - it requires 5 seconds
		//SpaceObject3DModel copy = new SpaceObject3DModel(this.name);
		
		SpaceObject3DModel copy = new SpaceObject3DModel();
		copy.name = this.name;
		copy.memory = this.memory;
		copy.vertices = (ArrayList<Integer>) this.vertices.clone();
		//don't do this
		//shallow copy
		//copy.vertices = this.vertices;
		
		copy.points = Arrays.copyOf(this.points, this.points.length);
		return copy;
		
	}
	
	
	
}






