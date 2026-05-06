package ro.ase.csie.cts.patterns.flyweight;

import java.util.ArrayList;
import java.util.Random;


// This model is for the shared/permanent data

public class Model3D {
	private String name;
	private ModelType type;
	ArrayList<Double> points;
	
	public Model3D(ModelType type) {
		this.type = type;
		this.name = type.toString();
		points = new ArrayList<>((int)1e6);
		System.out.println("Creating model for " + this.name);
		for(int i = 0; i < (int)1e6; i++ ) {
			points.add(new Random().nextDouble());
		}
	}
}
