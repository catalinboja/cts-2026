package ro.ase.csie.cts.design.patterns.singleton.lazy;

public class MatchConfiguration {

	private int maxPlayers;
	private String levelName;
	
	private static MatchConfiguration config = null;

	private MatchConfiguration() {
		System.out.println("Loading match config from game settings file ...");
		this.maxPlayers = 50;
		this.levelName = "Intro";
	}
	
	public static synchronized MatchConfiguration getConfig() {
		if(config == null) {
			config = new MatchConfiguration();
		}
		return config;
	}
	
	
}
