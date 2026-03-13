package ro.ase.csie.cts.clean.code.stage3;

public class PriceDiscount {

	public static final int ACCOUNT_LIMIT_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;

	public static float getAccountDiscount(int accountAgeInYears) {
		return (accountAgeInYears > ACCOUNT_LIMIT_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
				: (float) accountAgeInYears / 100;
	}
	
	public static float getProductPriceWithDiscount(
			ProductType productType, float initialPrice) {
		return initialPrice - (productType.getDiscount() * initialPrice);
	}
	
	public float getPriceWithDiscount(ProductType productType, float initialPrice, int accountAgeInYears) {

		if(productType == ProductType.NORMAL) {
			return initialPrice;
		} 
		
		return getProductPriceWithDiscount(productType, initialPrice) * 
					(1 - getAccountDiscount(accountAgeInYears));
	}
}
