package ro.ase.csie.cts.clean.code.stage1;

public class PriceDiscount {
	
	public static final int ACCOUNT_LIMIT_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;
	public static final int NORMAL_PRODUCT = 1;
	public static final int SILVER_PRODUCT = 2;
	public static final int GOLD_PRODUCT = 3;
	public static final int PLATINUM_PRODUCT = 4;
	public static final float SILVER_DISCOUNT = 0.1f;
	public static final float GOLD_DISCOUNT = 0.25f;
	public static final float PLATINUM_DISCOUNT = 0.35f;
	
	
	public float getPriceWithDiscount(int productType, float initialPrice, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float accountDiscount = (accountAgeInYears > ACCOUNT_LIMIT_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT : (float)accountAgeInYears/100; 
	    if (productType == NORMAL_PRODUCT)
	    {
	      finalPrice = initialPrice;
	    }
	    else if (productType == SILVER_PRODUCT)
	    {
	      finalPrice = (initialPrice - (SILVER_DISCOUNT * initialPrice)) - accountDiscount * (initialPrice - (SILVER_DISCOUNT * initialPrice));
	    }
	    else if (productType == GOLD_PRODUCT)
	    {
	      finalPrice = (initialPrice - (GOLD_DISCOUNT * initialPrice)) - accountDiscount * (initialPrice - (GOLD_DISCOUNT * initialPrice));
	    }
	    else if (productType == PLATINUM_PRODUCT)
	    {
	      finalPrice = (initialPrice - (PLATINUM_DISCOUNT * initialPrice)) - accountDiscount * (initialPrice - (PLATINUM_DISCOUNT * initialPrice));
	    }
	    return finalPrice;
	  }
}
