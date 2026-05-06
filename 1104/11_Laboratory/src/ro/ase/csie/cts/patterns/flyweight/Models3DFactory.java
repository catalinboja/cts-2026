package ro.ase.csie.cts.patterns.flyweight;

import java.util.HashMap;

public class Models3DFactory {
	
	private static HashMap<ModelType, Model3D> models = 
			new HashMap<>();
	
	public static Model3D getModel(ModelType type) {
		Model3D model = models.get(type);
		if(model == null) {
			model = new Model3D(type);
			models.put(type, model);
		}
		return model;
	}
	
}
