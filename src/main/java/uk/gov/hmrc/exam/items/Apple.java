package uk.gov.hmrc.exam.items;

public class Apple extends Item{

    private static final double UNIT_PRICE = 0.60;

    @Override
    public double getUnitPrice() {
        return UNIT_PRICE;
    }
}