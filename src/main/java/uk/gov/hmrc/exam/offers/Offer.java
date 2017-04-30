package uk.gov.hmrc.exam.offers;

import uk.gov.hmrc.exam.items.Item;

public interface Offer {

    abstract double apply(Item item);

}
