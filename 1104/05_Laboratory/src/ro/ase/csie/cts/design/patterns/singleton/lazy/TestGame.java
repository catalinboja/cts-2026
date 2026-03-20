package ro.ase.csie.cts.design.patterns.singleton.lazy;

public class TestGame {

	public static void main(String[] args) {
		
		MatchConfiguration config1 = MatchConfiguration.getConfig();
		MatchConfiguration config2 = MatchConfiguration.getConfig();
		
		if(config1 == config2) {
			System.out.println("Same object");
		} else 
		{
			System.out.println("Different objects");
		}
		
	}

}
