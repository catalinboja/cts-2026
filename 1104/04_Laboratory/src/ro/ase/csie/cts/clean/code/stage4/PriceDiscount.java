package ro.ase.csie.cts.clean.code.stage4;

import ro.ase.csie.cts.clean.code.stage4.marketing.IMarketingStrategy;

public class PriceDiscount {

	IMarketingStrategy mkStrategy = null;
	
	//dependency injection
	//setter injection
	public void setMkStrategy(IMarketingStrategy mkStrategy) {
		this.mkStrategy = mkStrategy;
	}
	
	//constructor injection
	public PriceDiscount(IMarketingStrategy mkStrategy) {
		this.mkStrategy = mkStrategy;
	}
	
	
	public float getAccountDiscount(int accountAgeInYears) {
		if(this.mkStrategy == null)
			throw new UnsupportedOperationException("Missing mk interface reference");
		//callback
		return this.mkStrategy.getAccountDiscount(accountAgeInYears);
	}


	public float getProductPriceWithDiscount(
			ProductType productType, float initialPrice) {
		
		if(this.mkStrategy == null)
			throw new UnsupportedOperationException("Missing mk interface reference");
		
		//callback
		return this.mkStrategy.getProductPriceWithDiscount(productType, initialPrice);
	}
	
	public float getPriceWithDiscount(ProductType productType, float initialPrice, int accountAgeInYears) {

		if(productType == ProductType.NORMAL) {
			return initialPrice;
		} 
		
		float priceWithDiscount = getProductPriceWithDiscount(productType, initialPrice);
		
		
		return getProductPriceWithDiscount(productType, initialPrice) * 
					(1 - getAccountDiscount(accountAgeInYears));
	}
}
