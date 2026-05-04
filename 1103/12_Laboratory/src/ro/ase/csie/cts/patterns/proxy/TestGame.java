package ro.ase.csie.cts.patterns.proxy;

public class TestGame {

	public static void main(String[] args) {
		IChatServer chatServer = new ChatServer();
		chatServer = new ChatServerFilteringProxy(chatServer);
		chatServer.sendMessage(
				"john", "alice", "I hate you. You are cheating");
		chatServer.sendMessage(
				"john", "alice", "Let's play again");
	}

}
