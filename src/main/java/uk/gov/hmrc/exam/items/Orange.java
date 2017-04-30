package uk.gov.hmrc.exam.items;

public class Orange extends Item {

    private static final double UNIT_PRICE = 0.25;

    @Override
    public double getUnitPrice() {
        return UNIT_PRICE;
    }
}