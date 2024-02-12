import java.lang.annotation.Target;

public class Bus extends Vehicle {

    protected String fuelType;
    protected String oysterType;
    protected double price;

    public Bus(int numberOfWheels, int maxOccupancy, String travelEnviron, double price, String fuelType, String oysterType){
        super(numberOfWheels, maxOccupancy,travelEnviron);
        this.price = price;
        this.fuelType = fuelType;
        this.oysterType = oysterType;
    }

    public double getPrice() {
        return price;
    }
}
