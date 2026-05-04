package ro.ase.csie.cts.patterns.composite;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractNPCGroup levelBoss = new NPC("Level Boss", 100);
		
		AbstractNPCGroup enemy1 = new NPC("Enemy1", 25);
		AbstractNPCGroup enemy2 = new NPC("Enemy2", 25);
		
		AbstractNPCGroup group1 = new Group("Group1");
		group1.addItem(enemy1);
		group1.addItem(enemy2);
		
		AbstractNPCGroup group2 = new Group("Group2");
		group2.addItem(new NPC("Enemy3", 10));
		group2.addItem(new NPC("Enemy4", 10));
		
		
		group1.addItem(group2);
		
		Group level = new Group("Level 1");
		level.addItem(levelBoss);
		level.addItem(group1);
		
		level.move();
		
	}

}
