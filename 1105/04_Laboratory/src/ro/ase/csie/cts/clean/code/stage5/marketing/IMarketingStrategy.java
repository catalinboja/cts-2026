package ro.ase.csie.cts.clean.code.stage5.marketing;

import ro.ase.csie.cts.clean.code.stage5.ProductType;

public interface IMarketingStrategy {

	public static final int MIN_YEARS_FOR_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;
	
	public static float computeDiscountValue(float price, float discountAbsoluteValue) {
		return price * discountAbsoluteValue;
	}
	
	public static float computePriceWithDiscount(float price, float discountValue) {
		return price - discountValue;
	}
	
	public abstract float computeAccountDiscount(int accountAgeInYears);
	float computePriceAndApplyDiscount(float price, ProductType type);
	
}
