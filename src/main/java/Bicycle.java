public class Bicycle extends Vehicle {

    protected String ownershipType;
    protected double rentalPrice;
    protected double buyPrice;

    public Bicycle(int numberOfWheels, int maxOccupancy, String travelEnviron, String ownershipType, double rentalPrice, double buyPrice) {
        super(numberOfWheels, maxOccupancy, travelEnviron);
        this.ownershipType = ownershipType;
        this.rentalPrice = rentalPrice;
        this.buyPrice = buyPrice;
    }

    public double rentBicycle() {
        if (this.ownershipType == "Rental") {
            return rentalPrice;
        } else {
            return 0;
        }
    }

    public double buyBicycle() {
        if (!this.ownershipType.equals("Rental")) {
            return buyPrice;
        }
        return 10000; // if wanting to buy a rental bicycle
    }

//
}