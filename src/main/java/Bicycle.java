public class Bicycle extends Vehicle {

    protected String ownershipType;
    public Bicycle(int numberOfWheels, int maxOccupancy, String travelEnviron, String ownershipType){
        super(numberOfWheels, maxOccupancy,travelEnviron);
        this.ownershipType = ownershipType;
    }

    public double rentBicycle(){
        if (this.ownershipType == "Rental"){
        
        }
    }

}