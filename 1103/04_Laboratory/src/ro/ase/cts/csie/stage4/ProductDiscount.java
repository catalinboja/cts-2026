package ro.ase.cts.csie.stage4;

import ro.ase.cts.csie.stage4.marketing.IMarketingStrategy;

public class ProductDiscount {

	private IMarketingStrategy mkStrategy = null;
	
	//setter injection
	public void setMarketingStrategy(IMarketingStrategy strategy) {
		this.mkStrategy = strategy;
	}
	
	//constructor injection
	public ProductDiscount(IMarketingStrategy strategy) {
		this.mkStrategy = strategy;
	}

	public float getAccountDiscount(int accountAgeInYears) {
		//call-back to the mk strategy
		return this.mkStrategy.getAccountDiscount(accountAgeInYears);
	}
	
	public float getPriceWithAllDiscounts(float price, 
			ProductType type, float accountDiscount) {
		//call-back to the mk strategy
		return this.mkStrategy.getPriceWithAllDiscounts(
				price, type, accountDiscount);
	}

	public float getFinalPriceWithDiscount(ProductType productType, 
			float initialPrice, int userAccountAge) {
		
		float accountDiscount = 
				productType == ProductType.NEW ? 0 : getAccountDiscount(userAccountAge);
		
		return getPriceWithAllDiscounts(
					initialPrice, productType, accountDiscount);
	}
}
