package interview;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void shouldApplyChocolateCategoryLimit() {
        List<PurchaseDTO> basket = new ArrayList();
        PurchaseDTO chocolateFerero = new PurchaseDTO();
        chocolateFerero.setId(Variables.CHOCOLATE_FERERO_ID);
        chocolateFerero.setCategory(Variables.CHOCOLATE_CATEGORY);
        chocolateFerero.setQuantity(5);

        PurchaseDTO chocolateMilka = new PurchaseDTO();
        chocolateMilka.setId(Variables.CHOCOLATE_MILKA_ID);
        chocolateMilka.setCategory(Variables.CHOCOLATE_CATEGORY);
        chocolateMilka.setQuantity(6);

        basket.add(chocolateFerero);
        basket.add(chocolateMilka);

        ChocolateLimit chocolateLimit = new ChocolateLimit();
        boolean isApplied = chocolateLimit.checkCategory(basket);

        assert isApplied == true;
    }
}
