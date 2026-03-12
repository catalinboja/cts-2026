package ro.ase.cts.csie.stage4.marketing;

import ro.ase.cts.csie.stage4.ProductType;

public class EasterStrategy implements IMarketingStrategy{

	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > ACCOUNT_AGE_DISCOUNT_LIMIT) ? MAX_ACCOUNT_DISCOUNT
				: (float) accountAgeInYears / 100;
	}
	
	
	@Override
	public float getPriceWithAllDiscounts(float price, ProductType type, float accountDiscount) {
		return IMarketingStrategy.getPriceWithDiscount(price, type.getDiscount()) * 
				(1 - accountDiscount);
	}

}
