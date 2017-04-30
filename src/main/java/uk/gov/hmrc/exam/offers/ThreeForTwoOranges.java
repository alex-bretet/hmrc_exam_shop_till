package uk.gov.hmrc.exam.offers;

import uk.gov.hmrc.exam.items.Item;
import uk.gov.hmrc.exam.items.Orange;

public class ThreeForTwoOranges implements Offer{

    private int orangesInBasket;

    @Override
    public double apply(Item item) {
        double price = item.getUnitPrice();

        if (item instanceof Orange) {
            orangesInBasket++;
            if (isEligibleForDiscount()) {
                price = 0.0;
            }
        }

        return price;
    }

    private boolean isEligibleForDiscount(){
        return orangesInBasket % 3 == 0;
    }
}
