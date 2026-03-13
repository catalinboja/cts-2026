package ro.ase.csie.cts.clean.code.stage5;

import ro.ase.csie.cts.clean.code.stage5.marketing.IMarketingStrategy;

public class ProductDiscount {

	private IMarketingStrategy mkStrategy;
	
	//dependency injection
	//setter injection
	public void setMkStrategy(IMarketingStrategy mkStrategy) {
		this.mkStrategy = mkStrategy;
	}
	
	//constructor injection
	public ProductDiscount(IMarketingStrategy mkStrategy) {
		this.mkStrategy = mkStrategy;
	}
	
	public float computePriceAndApplyDiscount(float price, ProductType type) {
		//callback
		if(this.mkStrategy != null)
		{
			return mkStrategy.computePriceAndApplyDiscount(
					price, type);
		} else {
			throw new UnsupportedOperationException(
					"Missing marketing reference!");
		}
	}

	public float computeAccountDiscount(int accountAgeInYears) {
		if(this.mkStrategy != null) {
			return this.mkStrategy.computeAccountDiscount(accountAgeInYears);
		} else {
			throw new UnsupportedOperationException("Missing marketing reference!");
		}
	}

	public float getFinalPriceWithDiscount(ProductType productType, float price, int accountAgeInYears) {

		if(productType == ProductType.NORMAL) {
			return price;
		} 
		
		float accountDiscount = computeAccountDiscount(accountAgeInYears);
		return computePriceAndApplyDiscount(price, productType) * 
					(1-accountDiscount);
	}
}
