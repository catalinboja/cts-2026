package ro.ase.csie.cts.design.patterns.singleton.lazy;

public class MatchConfiguration {
	
	private static MatchConfiguration config;
	
	private int maxPlayers;
	private int defaultDisfficulty;
	
	private MatchConfiguration() {
		System.out.println("Loading match configuration...");
		this.maxPlayers = 50;
		this.defaultDisfficulty = 5;
	}
	
	public static synchronized MatchConfiguration getConfig() {
		if(config == null) {
			config = new MatchConfiguration();
		}
		return config;
	}
	
	
}
