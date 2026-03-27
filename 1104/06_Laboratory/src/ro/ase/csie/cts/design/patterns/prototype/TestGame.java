package ro.ase.csie.cts.design.patterns.prototype;

public class TestGame {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		ModelBuilding3D tower1 = new ModelBuilding3D("Tower");
//		ModelBuilding3D tower2 = new ModelBuilding3D("Tower");
//		ModelBuilding3D tower3 = new ModelBuilding3D("Tower");
		
		ModelBuilding3D tower2 = (ModelBuilding3D) tower1.clone();
		ModelBuilding3D tower3 = (ModelBuilding3D) tower1.clone();
		
		System.out.println("Level loaded.");
		
	}

}
