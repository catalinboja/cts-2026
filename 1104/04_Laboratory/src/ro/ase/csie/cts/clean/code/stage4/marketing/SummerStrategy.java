package ro.ase.csie.cts.clean.code.stage4.marketing;

import ro.ase.csie.cts.clean.code.stage4.ProductType;

public class SummerStrategy implements IMarketingStrategy{

	@Override
	public float getAccountDiscount(int accountAgeInYears) {
		return 0.15f;
	}

	@Override
	public float getProductPriceWithDiscount(ProductType productType, float initialPrice) {
		// TODO Auto-generated method stub
		return initialPrice*(1 - 0.3f);
	}

}
