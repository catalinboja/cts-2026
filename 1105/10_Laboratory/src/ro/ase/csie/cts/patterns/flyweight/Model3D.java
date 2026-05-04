package ro.ase.csie.cts.patterns.flyweight;

import java.util.ArrayList;

public class Model3D {
	String name;
	ArrayList<Double> points;
	
	public Model3D(String name) {
		System.out.println("Initializing model for " + name);
		this.name = name;
		this.points = new ArrayList<>((int)1e6);
	}
}
