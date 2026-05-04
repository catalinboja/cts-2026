package ro.ase.csie.cts.patterns.proxy;

public class ChatServerFilteringProxy implements IChatServer {
	
	IChatServer realChatSever;
	
	public ChatServerFilteringProxy(IChatServer chatServer) {
		this.realChatSever = chatServer;
	}

	@Override
	public void sendMessage(String destination, String source, String message) {
		String[] blacklistedWords = new String[] {"hate", "cheat", "hack"};
		//filter the message
		for(String blacklistedWord : blacklistedWords) {
			if(message.toLowerCase().contains(blacklistedWord)) {
					System.out.println("Message contains a restricted word. Is blocked");
					return;
			}
		}
		
		//if the message is ok we forward it to the real chat server
		if(this.realChatSever != null) {
			this.realChatSever.sendMessage(destination, source, message);
		}
		
	}

}
