package uk.gov.hmrc.exam.checkout;

import uk.gov.hmrc.exam.items.Apple;
import uk.gov.hmrc.exam.datastructures.Items;
import uk.gov.hmrc.exam.items.Orange;
import java.util.Collection;

public class Till {

    private final Items items = new Items(new Apple(0.6), new Orange(0.25));

    public double scanItems(Collection<String> ids) {
        double due = 0.0;
        for(String id : ids){
            due += items.findPriceById(id);
        }
        return due;
    }
}
