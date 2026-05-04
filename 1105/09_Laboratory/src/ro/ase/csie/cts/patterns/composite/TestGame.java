package ro.ase.csie.cts.patterns.composite;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractNPCGroup levelBoss = new NPC("Level Boss", 100);
		AbstractNPCGroup group1 = new Group("Group 1");
		group1.addItem(new NPC("Soldier 1", 25));
		group1.addItem(new NPC("Soldier 2", 25));
		
		AbstractNPCGroup group2 = new Group("Group 2");
		group2.addItem(new NPC("Soldier 3", 25));
		group2.addItem(new NPC("Soldier 4", 25));
		
		group1.addItem(group2);
		
		AbstractNPCGroup level = new Group("Level 1");
		level.addItem(levelBoss);
		level.addItem(group1);
		
		level.move();
		
	}

}
