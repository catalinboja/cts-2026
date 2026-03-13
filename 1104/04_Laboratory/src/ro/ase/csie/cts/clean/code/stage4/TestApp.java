package ro.ase.csie.cts.clean.code.stage4;

import ro.ase.csie.cts.clean.code.initial.Clasa1;
import ro.ase.csie.cts.clean.code.stage4.marketing.EasterStrategy;
import ro.ase.csie.cts.clean.code.stage4.marketing.IMarketingStrategy;
import ro.ase.csie.cts.clean.code.stage4.marketing.SummerStrategy;

public class TestApp {

	public static void main(String[] args) {
		
		//IMarketingStrategy currentStrategy = new EasterStrategy();
		IMarketingStrategy currentStrategy = new SummerStrategy();
		
		PriceDiscount priceDiscountService = new PriceDiscount(currentStrategy);
		float finalPrice = priceDiscountService.getPriceWithDiscount(
				ProductType.GOLD, 1000, 5);
		System.out.println("Final price is " + finalPrice);
		float finalPriceV1 = (new Clasa1()).Calculeaza(3, 1000, 5);
		System.out.println("Final price is " + finalPriceV1);
		
	}

}
