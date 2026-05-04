package ro.ase.csie.cts.patterns.composite;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractNPCGroup levelBoss = new NPC("Level Boss", 100);
		AbstractNPCGroup group1 = new Group("Group 1");
		AbstractNPCGroup enemy1 = new NPC("Enemmy 1", 20);
		AbstractNPCGroup enemy2 = new NPC("Enemmy 2", 25);
		
		group1.addItem(enemy1);
		group1.addItem(enemy2);
		
		AbstractNPCGroup group2 = new Group("Group 2");
		group2.addItem(new NPC("Enemy 3", 10));
		group2.addItem(new NPC("Enemy 4", 5));
		
		group1.addItem(group2);
		
		AbstractNPCGroup level = new Group("Level 1");
		level.addItem(levelBoss);
		level.addItem(group1);
		
		level.move();
		
	}

}
