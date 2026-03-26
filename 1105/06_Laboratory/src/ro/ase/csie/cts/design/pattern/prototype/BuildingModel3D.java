package ro.ase.csie.cts.design.pattern.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BuildingModel3D implements Cloneable{
	private String name;
	private float memory;
	private int[] points;
	private ArrayList<Integer> vertices;
	
	public BuildingModel3D(String name) throws InterruptedException {
		System.out.println("Rendering model for " + name);
		Thread.sleep(5000);
		this.name = name;
		Random random = new Random();
		this.memory = random.nextFloat()*1000;
		this.points = new int[5];
		for(int i = 0; i < 5 ;i++) {
			this.points[i] = random.nextInt(100);
		}
		this.vertices = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			this.vertices.add(random.nextInt(1000));
		}
		System.out.println("Model created");	
	}
	
	private BuildingModel3D() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// a mistake - don't use the 5 seconds ctor
		//BuildingModel3D copy = new BuildingModel3D(this.name);
		
		BuildingModel3D copy = new BuildingModel3D();
		//deep copy
		copy.name = this.name;
		//copy.name = new String(this.name);
		copy.memory = this.memory;
		
		//classic way
		copy.points = new int[this.points.length];
		for(int i = 0; i < this.points.length; i++) {
			copy.points[i] = this.points[i];
		}
		copy.points = Arrays.copyOf(this.points, this.points.length);
		copy.vertices = (ArrayList<Integer>) this.vertices.clone();
		return copy;
	}
	
	
}







