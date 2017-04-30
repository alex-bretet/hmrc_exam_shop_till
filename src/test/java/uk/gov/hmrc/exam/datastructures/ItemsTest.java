package uk.gov.hmrc.exam.datastructures;

import org.junit.Test;
import uk.gov.hmrc.exam.items.Apple;
import uk.gov.hmrc.exam.items.Item;
import uk.gov.hmrc.exam.items.Orange;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ItemsTest {

    private Item item1 = new Apple();
    private Item item2 = new Orange();
    private Items items = new Items(item1, item2);

    @Test
    public void findById(){
        assertEquals(item1, items.findById("Apple"));
        assertEquals(item2, items.findById("Orange"));
    }

    @Test
    public void findById_throwsWhenNotFound_exceptionType(){
        try{
            Items items = new Items(item2 );
            items.findById("Apple");
            fail();
        }
        catch(Exception e){
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void findById_throwsWhenNotFound_exceptionMessage(){
        try{
            Items items = new Items(item2 );
            items.findById("Apple");
            fail();
        }
        catch(Exception e){
            assertEquals("Unidentified item: Apple", e.getMessage());
        }
    }
}
