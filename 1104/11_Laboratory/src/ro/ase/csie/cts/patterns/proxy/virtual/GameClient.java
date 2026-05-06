package ro.ase.csie.cts.patterns.proxy.virtual;

public class GameClient implements IGameClient{

	@Override
	public void display3DModel(String modelName) {
		System.out.println(
				"Loading and displaying very detailed model for " + modelName);
	}

}
