package ro.ase.csie.cts.design.pattern.prototype;

public class TestGame {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		
		BuildingModel3D defenseTower = new BuildingModel3D("Tower1");
//		BuildingModel3D defenseTower2 = new BuildingModel3D("Tower1");
//		BuildingModel3D defenseTower3 = new BuildingModel3D("Tower1");
		
		BuildingModel3D defenseTower2 = 
				(BuildingModel3D) defenseTower.clone();
		BuildingModel3D defenseTower3 = 
				(BuildingModel3D) defenseTower.clone();
		System.out.println("Level loaded");
		
	}

}
