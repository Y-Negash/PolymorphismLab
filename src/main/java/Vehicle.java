public abstract class Vehicle {

   protected int numberOfWheels;
   protected int maxOccupancy;
   protected String travelEnviron;

//    CONSTRUCTOR
    public Vehicle(int numberOfWheels, int maxOccupancy, String travelEnviron){
        this.numberOfWheels = numberOfWheels;
        this.maxOccupancy = maxOccupancy;
        this.travelEnviron = travelEnviron;
    }
//ACCELERATE METHOD
    public String accelerate(){
        return "Speeding up!";
    }
//BRAKE METHOD
    public abstract String brake();
}
