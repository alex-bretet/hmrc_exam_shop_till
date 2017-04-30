package uk.gov.hmrc.exam.datastructures;

import uk.gov.hmrc.exam.items.Item;
import uk.gov.hmrc.exam.offers.Offer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Offers implements Offer{

    private final Set<Offer> offers;

    public Offers(Offer... offers){
        this.offers = new HashSet<>(Arrays.asList(offers));
    }

    @Override
    public double apply(Item item) {
        return offers.stream()
                .mapToDouble(o -> o.apply(item))
                .min()
                .getAsDouble();
    }
}
