import interfaces.ISell;

import java.util.Objects;

public class Bicycle extends Vehicle implements ISell {

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

    public String brake(){
        return "Slowing the bicycle down!";
    }

    public double rentBicycle() {
        if (Objects.equals(this.ownershipType, "Rental")) {
            return rentalPrice;
        } else {
            return 0;
        }
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

    public double getBuyPrice() {
        return buyPrice;
    }

}