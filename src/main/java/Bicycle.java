import java.util.Objects;

public class Bicycle extends Vehicle {

    protected String ownershipType;
    protected double rentalPrice;
    protected double buyPrice;
    protected int rentTime;

    public Bicycle(int numberOfWheels, int maxOccupancy, String travelEnviron, String ownershipType,int rentTime, double rentalPrice, double buyPrice) {
        super(numberOfWheels, maxOccupancy, travelEnviron);
        this.ownershipType = ownershipType;
        this.rentalPrice = rentalPrice;
        this.buyPrice = buyPrice;
        this.rentTime = rentTime;
    }

    public double rentBicycle() {
        if (Objects.equals(this.ownershipType, "Rental")) {
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

    public double rentBicycle(int rentTime) {
        if(this.rentTime > 60){
            return this.rentalPrice * 1.5 ;
        } else if (this.rentTime < 60) {
            return this.rentalPrice * 0.5;
        } else {
            return this.rentalPrice;
        }
    }

    public String brake(){
        return "Slowing the bicycle down!";
    }
//
}