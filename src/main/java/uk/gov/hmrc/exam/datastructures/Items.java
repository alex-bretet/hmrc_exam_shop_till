package uk.gov.hmrc.exam.datastructures;

import uk.gov.hmrc.exam.items.Item;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Items {

    private final Set<Item> items;

    public Items(Item... items){
        this.items = new HashSet<>(Arrays.asList(items));
    }

    public double findPriceById(String target){
        return items.stream()
                    .filter(i -> i.getId().equals(target))
                    .findAny()
                    .orElseThrow(() -> new IllegalArgumentException("Unidentified item: " + target))
                    .getUnitPrice();
    }
}
