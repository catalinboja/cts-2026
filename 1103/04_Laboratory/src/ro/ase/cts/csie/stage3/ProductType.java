package ro.ase.cts.csie.stage3;

// in Java an enum is a special class

public enum ProductType {
	NEW(0), SILVER(0.1f), GOLD(0.25f), PLATINUM(0.35f);
	
	float discount;
	
	public float getDiscount() {
		return this.discount;
	}
	
	private ProductType(float discount) {
		this.discount = discount;
	}
}
