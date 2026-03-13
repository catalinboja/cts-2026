package ro.ase.csie.cts.clean.code.stage4.marketing;

import ro.ase.csie.cts.clean.code.stage4.ProductType;

public interface IMarketingStrategy {

	public static final float MAX_DISCOUNT = 0.99f;
	
	float getAccountDiscount(int accountAgeInYears);
	float getProductPriceWithDiscount(ProductType productType, float initialPrice);
}
