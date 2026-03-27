package ro.ase.csie.cts.design.patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ModelBuilding3D implements Cloneable{
	private String name;
	private float memory;
	private int[] points;
	private ArrayList<Integer> vertices;
	
	public ModelBuilding3D(String name) throws InterruptedException {
		System.out.println("Loading 3d model for " + name);
		this.name = name;
		Thread.sleep(5000);
		Random random = new Random();
		this.memory = random.nextFloat() * 1000;
		this.points = new int[5];
		for(int i = 0; i < 5; i++) {
			this.points[i] = random.nextInt(100);
		}
		this.vertices = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			this.vertices.add(random.nextInt(50));
		}
	}
	
	private ModelBuilding3D() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		//don't use the ctor with issues
		//ModelBuilding3D copy = new ModelBuilding3D(this.name);
		
		
		//only deep copy
		
		ModelBuilding3D copy = new ModelBuilding3D();
		copy.name = this.name;
		copy.memory = this.memory;
		copy.vertices = (ArrayList<Integer>) this.vertices.clone();
		
		//version 1
		copy.points = new int[this.points.length];
		for(int i = 0; i < this.points.length; i++) {
			copy.points[i] = this.points[i];
		}
		
		//version 2
		copy.points = Arrays.copyOf(this.points, this.points.length);
		
		return copy;
		
	}
	
	
}









