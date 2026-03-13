package ro.ase.csie.cts.clean.code.stage3;

public class ProductDiscount {

	public static final int MIN_YEARS_FOR_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;

	public float getFinalPriceWithDiscount(ProductType productType, float price, int accountAgeInYears) {
		float finalPrice = 0;
		float accountDiscount = (accountAgeInYears > MIN_YEARS_FOR_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
				: (float) accountAgeInYears / 100;

		switch (productType) {
		case NORMAL:
			finalPrice = price;
			break;
		case SILVER:
			finalPrice = (price - (ProductType.SILVER.getDiscount() * price))
					- accountDiscount * (price - (ProductType.SILVER.getDiscount() * price));
			break;
		case GOLD:
			finalPrice = (price - (ProductType.GOLD.getDiscount() * price))
					- accountDiscount * (price - (ProductType.GOLD.getDiscount() * price));
			break;
		case PLATINUM:
			finalPrice = (price - (ProductType.PLATINUM.getDiscount() * price))
					- accountDiscount * (price - (ProductType.PLATINUM.getDiscount() * price));
			break;
		default:
			throw new UnsupportedOperationException();
		}

		return finalPrice;
	}
}
