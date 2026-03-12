package ro.ase.cts.csie.stage4.marketing;

import ro.ase.cts.csie.stage4.ProductType;

public interface IMarketingStrategy {
	
	public static final int ACCOUNT_AGE_DISCOUNT_LIMIT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	public static float getDiscountValue(float price, float discountAbsoluteValue) {
		return price * discountAbsoluteValue;
	}
	
	public static float getPriceWithDiscount(float price, float discountAbsoluteValue) {
		return price - getDiscountValue(price, discountAbsoluteValue);
	}
	
	float getAccountDiscount(int accountAgeInYears);
	float getPriceWithAllDiscounts(float price, ProductType type, float accountDiscount);
}
