package ro.ase.csie.cts.clean.code.stage4;

public class ProductDiscount {

	public static final int MIN_YEARS_FOR_MAX_DISCOUNT = 10;
	public static final float ACCOUNT_MAX_DISCOUNT = 0.15f;
	
	public static float computeDiscountValue(float price, float discountAbsoluteValue) {
		return price * discountAbsoluteValue;
	}
	
	public static float computePriceWithDiscount(float price, float discountValue) {
		return price - discountValue;
	}
	
	public static float computePriceAndApplyDiscount(float price, float discountAbsoluteValue) {
		return price - computeDiscountValue(price, discountAbsoluteValue);
	}
	
	public static float computePriceAndApplyDiscount(float price, ProductType type) {
		return price - computeDiscountValue(price, type.getDiscount());
	}

	public float getFinalPriceWithDiscount(ProductType productType, float price, int accountAgeInYears) {
		float finalPrice = 0;
		float accountDiscount = (accountAgeInYears > MIN_YEARS_FOR_MAX_DISCOUNT) ? ACCOUNT_MAX_DISCOUNT
				: (float) accountAgeInYears / 100;

		switch (productType) {
		case NORMAL:
			finalPrice = price;
			break;
		case SILVER:
			finalPrice = computePriceAndApplyDiscount(price, ProductType.SILVER) -
				accountDiscount * computePriceAndApplyDiscount(price, ProductType.SILVER);
			break;
		case GOLD:
			finalPrice = computePriceAndApplyDiscount(price, ProductType.GOLD) -
			accountDiscount * computePriceAndApplyDiscount(price, ProductType.GOLD);
			break;
		case PLATINUM:
			finalPrice = computePriceAndApplyDiscount(price, ProductType.PLATINUM) -
			accountDiscount * computePriceAndApplyDiscount(price, ProductType.PLATINUM);
			break;
		default:
			throw new UnsupportedOperationException();
		}

		return finalPrice;
	}
}
