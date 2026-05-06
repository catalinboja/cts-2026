package ro.ase.csie.cts.patterns.proxy;

public class TestGame {

	public static void main(String[] args) {
		
		IChatServer chatServer = new ChatServer();
		
		
		chatServer = new FilteredChatServerProxy(chatServer, 
				new String[] {"hate", "cheat"});
		
		chatServer.sendMessage(
				"Alice", "Bob", "I hate you for winning. You are a chater");
		chatServer.sendMessage("Alice", "Bob", "Let's play another game");
		
	}

}
