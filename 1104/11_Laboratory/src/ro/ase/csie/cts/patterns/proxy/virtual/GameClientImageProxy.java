package ro.ase.csie.cts.patterns.proxy.virtual;

import java.util.Random;

public class GameClientImageProxy implements IGameClient{
	
	IGameClient gameClient;
	
	public GameClientImageProxy(GameClient gameClient) {
		this.gameClient = gameClient;
	}

	@Override
	public void display3DModel(String modelName) {
		// check the distance from that model
		// ...
		boolean isClose = new Random().nextBoolean();
		if(isClose) {
			//show the detailed model
			this.gameClient.display3DModel(modelName);
		} else {
			//show a thumbnail image
			System.out.println("Show low resolution image for  " + modelName);
		}
	}

}
