import interfaces.ISell;

public class Bus extends Vehicle implements ISell {

    protected String fuelType;
    protected String oysterType;
    protected  double oysterPrice; // this is the price of one ride using an oyster card
    protected double buyPrice = 10000;

    public Bus(int numberOfWheels, int maxOccupancy, String travelEnviron, double oysterPrice, String fuelType, String oysterType){
        super(numberOfWheels, maxOccupancy,travelEnviron);
        this.oysterPrice = oysterPrice;
        this.fuelType = fuelType;
        this.oysterType = oysterType;
    }

    public String brake(){
        return "Slowing the bus down!";
    }

    public double getOysterPrice(String oysterType){
        if(oysterType.equals("Senior")){
            return this.oysterPrice * 0;
        } else if (oysterType.equals("Student")) {
            return this.oysterPrice * 0.6;
        }
        return this.oysterPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }
}
