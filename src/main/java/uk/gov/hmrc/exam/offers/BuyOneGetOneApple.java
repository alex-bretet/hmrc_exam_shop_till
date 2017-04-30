package uk.gov.hmrc.exam.offers;

import uk.gov.hmrc.exam.items.Apple;
import uk.gov.hmrc.exam.items.Item;

public class BuyOneGetOneApple implements Offer{

    private int applesInBasket;

    @Override
    public double apply(Item item) {
        double price = item.getUnitPrice();

        if(item instanceof Apple){
            applesInBasket++;
            if(isEligible()){
                price = 0.0;
            }
        }
        return price;
    }

    private boolean isEligible(){
        return applesInBasket % 2 == 0;
    }
}
