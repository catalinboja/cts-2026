package ro.ase.csie.cts.patterns.proxy.virtual;

public class TestGame {

	public static void main(String[] args) {
		IGameClient gameClient = new GameClient();
		gameClient.display3DModel("Building");
		gameClient.display3DModel("Building");
	}
}
