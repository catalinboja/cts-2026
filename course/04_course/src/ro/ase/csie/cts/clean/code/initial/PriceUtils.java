package ro.ase.csie.cts.clean.code.initial;

public class PriceUtils {

    public static void processProductPrice(String productName,
                                           double basePrice,
                                           String customerType,
                                           boolean applyDiscount) {

        // 1. Validation
        if (basePrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        // 2. Calculate discount
        double discount = 0;
        if (applyDiscount) {
            if ("PREMIUM".equals(customerType)) {
                discount = 0.20;
            } else if ("REGULAR".equals(customerType)) {
                discount = 0.10;
            }
        }

        double discountedPrice = basePrice - (basePrice * discount);

        // 3. Apply tax
        double taxRate = 0.21;
        double finalPrice = discountedPrice + (discountedPrice * taxRate);

        // 4. Format output
        String formatted = String.format("Product: %s | Final price: %.2f",
                productName, finalPrice);

        // 5. Print invoice
        System.out.println("----- INVOICE -----");
        System.out.println(formatted);

        // 6. Log operation
        System.out.println("LOG: Price processed for product " + productName);
    }
}
