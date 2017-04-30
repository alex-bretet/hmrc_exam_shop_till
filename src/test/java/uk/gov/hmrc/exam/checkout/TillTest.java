package uk.gov.hmrc.exam.checkout;

import org.junit.Test;
import uk.gov.hmrc.exam.items.Apple;
import uk.gov.hmrc.exam.items.Item;
import uk.gov.hmrc.exam.items.Orange;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till checkoutSystem = new Till();
    private Item apple = new Apple();
    private Item orange = new Orange();

    @Test
    public void scanItems_noOffer(){
        String[] items = {"Apple", "Orange"};
        double basketPrice = apple.getUnitPrice() + orange.getUnitPrice();
        assertEquals(basketPrice, checkoutSystem.scanItems(Arrays.asList(items)), Double.MIN_VALUE);
    }

    @Test
    public void scanItems_withBuyOneGetOneAppleOffer(){
        String[] items = {"Apple", "Apple", "Orange", "Apple"};
        double basketPrice = apple.getUnitPrice() * 2 + orange.getUnitPrice();
        assertEquals(basketPrice, checkoutSystem.scanItems(Arrays.asList(items)), Double.MIN_VALUE);
    }

    @Test
    public void scanItems_withBuyOneGetOneAppleOffer_twice(){
        String[] items = {"Apple", "Apple", "Orange", "Apple", "Apple"};
        double basketPrice = apple.getUnitPrice() * 2 + orange.getUnitPrice();
        assertEquals(basketPrice, checkoutSystem.scanItems(Arrays.asList(items)), Double.MIN_VALUE);
    }

    @Test
    public void scanItems_withThreeForTwoOrangesOffer(){
        String[] items = {"Apple", "Orange", "Orange", "Orange"};
        double basketPrice = apple.getUnitPrice() + orange.getUnitPrice() * 2;
        assertEquals(basketPrice, checkoutSystem.scanItems(Arrays.asList(items)), Double.MIN_VALUE);
    }

    @Test
    public void scanItems_withThreeForTwoOrangesOffer_andBuyOneGetOneAppleOffer(){
        String[] items = {"Apple", "Apple", "Orange", "Orange", "Orange"};
        double basketPrice = apple.getUnitPrice() + orange.getUnitPrice() * 2;
        assertEquals(basketPrice, checkoutSystem.scanItems(Arrays.asList(items)), Double.MIN_VALUE);
    }
}