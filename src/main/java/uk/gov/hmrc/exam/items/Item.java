package uk.gov.hmrc.exam.items;

public abstract class Item {

    private final String id = getClass().getSimpleName();
    public abstract double getUnitPrice();

    public String getId(){
        return id;
    }
}
