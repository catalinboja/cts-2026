package ro.ase.csie.cts.patterns.flyweight;

import java.util.ArrayList;

public class Model3D {
	protected String name;
	ArrayList<Double> modelPoints;
	
	
	public Model3D(String name) {
		this.name = name;
		// simulate a lot of memory space
		this.modelPoints = new ArrayList<>(100000);
	}
}
