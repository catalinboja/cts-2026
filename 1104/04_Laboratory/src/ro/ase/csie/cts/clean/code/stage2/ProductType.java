package ro.ase.csie.cts.clean.code.stage2;

public enum ProductType {
	NORMAL("Normal", 0), 
	SILVER("Silver", 0.1f),
	GOLD("Gold", 0.25f),
	PLATINUM("Platinum", 0.35f);
	
	float discount;
	String name;
	
	public float getDiscount() {
		return this.discount;
	}
	
	public String getName() {
		return this.name;
	}
	
	private ProductType(String name, float discount) {
		
	}
	
}
