package uk.gov.hmrc.exam.items;

public abstract class Item {

    private final String id = getClass().getSimpleName();
    private double unitPrice;

    public String getId(){
        return id;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    protected void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
