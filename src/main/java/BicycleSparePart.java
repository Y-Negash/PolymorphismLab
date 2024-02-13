import interfaces.ISell;

public class BicycleSparePart implements ISell {
    protected String partName;
    protected String bicycleModel;
    protected double buyPrice;

    public BicycleSparePart(String partName, String bicycleModel, double buyPrice) {
        this.partName = partName;
        this.bicycleModel = bicycleModel;
        this.buyPrice = buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }
}
