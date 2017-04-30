package uk.gov.hmrc.exam.checkout;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till checkoutSystem = new Till();

    @Test
    public void scanItems_assertPrice(){
        String[] items = {"Apple", "Apple", "Orange", "Apple"};
        assertEquals(2.05, checkoutSystem.scanItems(Arrays.asList(items)), Double.MIN_VALUE);
    }
}