package uk.gov.hmrc.exam.datastructures;

import org.junit.Test;
import uk.gov.hmrc.exam.items.Apple;
import uk.gov.hmrc.exam.items.Item;
import uk.gov.hmrc.exam.items.Orange;
import static org.junit.Assert.assertEquals;

public class ItemsTest {

    private Item item1 = new Apple(0.6);
    private Item item2 = new Orange(0.25);
    private Items items = new Items(item1, item2);

    @Test
    public void findPriceById(){
        assertEquals(item1.getUnitPrice(), items.findPriceById("Apple"), Double.MIN_VALUE);
        assertEquals(item2.getUnitPrice(), items.findPriceById("Orange"), Double.MIN_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findPriceById_throwsWhenNotFound(){
        Items items = new Items(item2 );
        items.findPriceById("Apple");
    }
}
