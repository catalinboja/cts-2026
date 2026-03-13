package ro.ase.csie.cts.clean.code.stage2;

public class PriceDiscount {

	public static final int ACCOUNT_LIMIT_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;

	public float getPriceWithDiscount(ProductType productType, float initialPrice, int accountAgeInYears) {
		float finalPrice = 0;
		float accountDiscount = (accountAgeInYears > ACCOUNT_LIMIT_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
				: (float) accountAgeInYears / 100;

		switch (productType) {
		case NORMAL:
			finalPrice = initialPrice;
			break;
		case SILVER:
			finalPrice = (initialPrice - (ProductType.SILVER.getDiscount() * initialPrice))
					- accountDiscount * (initialPrice - (ProductType.SILVER.getDiscount() * initialPrice));
			break;
		case GOLD:
			finalPrice = (initialPrice - (ProductType.GOLD.getDiscount() * initialPrice))
					- accountDiscount * (initialPrice - (ProductType.GOLD.getDiscount() * initialPrice));
			break;
		case PLATINUM:
			finalPrice = (initialPrice - (ProductType.PLATINUM.getDiscount() * initialPrice))
					- accountDiscount * (initialPrice - (ProductType.PLATINUM.getDiscount() * initialPrice));
			break;
		default:
			throw new UnsupportedOperationException("Product type not covered");
		}

		return finalPrice;
	}
}
