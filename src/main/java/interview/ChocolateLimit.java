package interview;

import java.util.ArrayList;
import java.util.List;

public class ChocolateLimit {

    public boolean checkCategory(List<PurchaseDTO> basket) {
        boolean isApplied = false;
        List <PurchaseDTO> satisfiedItems = new ArrayList<>();
        for (PurchaseDTO item: basket) {
            if (item.getCategory().equals(Variables.CHOCOLATE_CATEGORY)) {
                satisfiedItems.add(item);
            }
        }
        int sum = satisfiedItems.stream().mapToInt(item -> item.getQuantity()).sum();
        if (sum > Variables.CHOCOLATE_LIMIT) {
            isApplied = true;
        }
        return isApplied;
    }

    public boolean checkItem(List<PurchaseDTO> basket) {
        boolean isApplied = false;
        for (PurchaseDTO item: basket) {
            if (item.getId() == Variables.CHOCOLATE_FERERO_ID) {
                isApplied = item.getQuantity() > Variables.CHOCOLATE_FERERO_LIMIT;
            }
        }
        return isApplied;
    }

}
