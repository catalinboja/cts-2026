package ro.ase.csie.cts.patterns.proxy;

public class FilteredChatServerProxy implements IChatServer{
	
	String[] blacklistedWords;
	IChatServer chatServer;
	
	public FilteredChatServerProxy(
			IChatServer chatServer, String[] words) {
		this.blacklistedWords = words;
		this.chatServer = chatServer;
	}
	
	
	@Override
	public void sendMessage(String author, String destination, String message) {

		//check for black listed words
		for(String word : this.blacklistedWords) {
			if(message.toLowerCase().contains(word)) {
				System.out.println("Found forbidden message. Drop it");
				System.out.println("Give warning to " + author);
				return;
			}
		}
		
		//callback the real chat server action
		this.chatServer.sendMessage(author, destination, message);
	}

}
