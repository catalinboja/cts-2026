package ro.ase.csie.cts.clean.code.stage5.marketing;

import ro.ase.csie.cts.clean.code.stage5.ProductType;

public class EasterStrategy implements IMarketingStrategy{

	@Override
	public float computeAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MIN_YEARS_FOR_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
				: (float) accountAgeInYears / 100;
	}

	@Override
	public float computePriceAndApplyDiscount(float price, ProductType type) {
		return price - IMarketingStrategy.computeDiscountValue(price, type.getDiscount());
	}

}



