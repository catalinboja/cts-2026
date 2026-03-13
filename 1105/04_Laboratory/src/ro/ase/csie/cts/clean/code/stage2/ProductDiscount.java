package ro.ase.csie.cts.clean.code.stage2;

public class ProductDiscount {
	
	public static final int MIN_YEARS_FOR_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;
	public static final int NORMAL_PRODUCT = 1;
	public static final int SILVER_PRODUCT = 2;
	public static final int GOLD_PRODUCT = 3;
	public static final int PLATINUM_PRODUCT = 4;
	public static final float SILVER_DISCOUNT = 0.1f;
	public static final float GOLD_DISCOUNT = 0.25f;
	public static final float PLATINUM_DISCOUNT = 0.35f;
	
	public float getFinalPriceWithDiscount(int productType, float price, int accountAgeInYears)
	  {
	    float finalPrice = 0;
	    float accountDiscount = (accountAgeInYears > MIN_YEARS_FOR_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT : (float)accountAgeInYears/100; 
	    if (productType == NORMAL_PRODUCT)
	    {
	      finalPrice = price;
	    }
	    else if (productType == SILVER_PRODUCT)
	    {
	      finalPrice = (price - (SILVER_DISCOUNT * price)) - accountDiscount * (price - (SILVER_DISCOUNT * price));
	    }
	    else if (productType == GOLD_PRODUCT)
	    {
	      finalPrice = (price - (GOLD_DISCOUNT * price)) - accountDiscount * (price - (GOLD_DISCOUNT * price));
	    }
	    else if (productType == PLATINUM_PRODUCT)
	    {
	      finalPrice = (price - (PLATINUM_DISCOUNT * price)) - accountDiscount * (price - (PLATINUM_DISCOUNT * price));
	    }
	    return finalPrice;
	  }
}
