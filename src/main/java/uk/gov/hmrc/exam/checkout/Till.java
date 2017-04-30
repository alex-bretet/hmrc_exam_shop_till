package uk.gov.hmrc.exam.checkout;

import uk.gov.hmrc.exam.datastructures.Offers;
import uk.gov.hmrc.exam.items.Apple;
import uk.gov.hmrc.exam.datastructures.Items;
import uk.gov.hmrc.exam.items.Orange;
import uk.gov.hmrc.exam.offers.BuyOneGetOneApple;
import uk.gov.hmrc.exam.offers.ThreeForTwoOranges;
import java.util.Collection;

public class Till {

    private final Items items = new Items(new Apple(), new Orange());

    public double scanItems(Collection<String> itemIds) {
        Offers offers = loadOffersForBasket();

        return itemIds.stream()
                    .map(i -> items.findById(i))
                    .mapToDouble(offers::apply)
                    .sum();
    }

    private Offers loadOffersForBasket(){
        return new Offers(new BuyOneGetOneApple(), new ThreeForTwoOranges());
    }
}
