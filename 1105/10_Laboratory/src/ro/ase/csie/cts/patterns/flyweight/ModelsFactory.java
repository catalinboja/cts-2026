package ro.ase.csie.cts.patterns.flyweight;

import java.util.HashMap;

public class ModelsFactory {
	static HashMap<String, Model3D> models = new HashMap<>();
	
	static Model3D getModel(String name) {
		Model3D model = models.get(name);
		if(model == null) {
			model = new Model3D(name);
			models.put(name, model);
		}
		return model;
	}
}
