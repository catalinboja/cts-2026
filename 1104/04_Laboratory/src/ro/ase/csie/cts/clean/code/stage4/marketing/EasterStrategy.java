package ro.ase.csie.cts.clean.code.stage4.marketing;

import ro.ase.csie.cts.clean.code.stage4.ProductType;

public class EasterStrategy implements IMarketingStrategy {

	public static final int ACCOUNT_LIMIT_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;
	
	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > ACCOUNT_LIMIT_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
				: (float) accountAgeInYears / 100;
	}

	@Override
	public float getProductPriceWithDiscount(ProductType productType, float initialPrice) {
		return initialPrice - (productType.getDiscount() * initialPrice);
	}
	
	

}
