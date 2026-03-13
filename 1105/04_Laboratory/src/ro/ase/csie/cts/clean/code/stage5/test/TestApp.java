package ro.ase.csie.cts.clean.code.stage5.test;

import ro.ase.csie.cts.clean.code.stage1.Clasa1;
import ro.ase.csie.cts.clean.code.stage5.ProductDiscount;
import ro.ase.csie.cts.clean.code.stage5.ProductType;
import ro.ase.csie.cts.clean.code.stage5.marketing.EasterStrategy;
import ro.ase.csie.cts.clean.code.stage5.marketing.IMarketingStrategy;

public class TestApp {

	public static void main(String[] args) {
		
		IMarketingStrategy currentStrategy = new EasterStrategy();
		ProductDiscount productDiscountService = new ProductDiscount(currentStrategy);
		
		float finalPrice = productDiscountService.getFinalPriceWithDiscount(
				ProductType.PLATINUM, 1000, 5);
		System.out.println("Final price: " + finalPrice);
		
		finalPrice = (new Clasa1()).Calculeaza(4, 1000, 5);
		System.out.println("Final price (initial implementation): " + finalPrice);
		
	}

}
