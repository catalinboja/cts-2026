package ro.ase.cts.csie.stage3;

public class ProductDiscount {
	
	public static final int ACCOUNT_AGE_DISCOUNT_LIMIT = 10;
	public static final float MAX_ACCOUNT_DISCOUNT = 0.15f;
	
	public float getFinalPriceWithDiscount(ProductType productType, float initialPrice, int userAccountAge)
	  {
	    float finalPrice = 0;
	    float accountDiscount = (userAccountAge > ACCOUNT_AGE_DISCOUNT_LIMIT) ? MAX_ACCOUNT_DISCOUNT : (float)userAccountAge/100; 
	    
	    switch(productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case SILVER:
	    	finalPrice = (initialPrice - (ProductType.SILVER.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (ProductType.SILVER.getDiscount() * initialPrice));
	    	break;
	    case GOLD:
	    	finalPrice = (initialPrice - (ProductType.GOLD.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (ProductType.GOLD.getDiscount() * initialPrice));
	    	break;
	    case PLATINUM:
	    	finalPrice = (initialPrice - (ProductType.PLATINUM.getDiscount() * initialPrice)) - accountDiscount * (initialPrice - (ProductType.PLATINUM.getDiscount() * initialPrice));
	    	break;
	    default:
	    	throw new UnsupportedOperationException("Not supported product type");
	    }
	    
	    return finalPrice;
	  }
}
