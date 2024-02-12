import java.util.ArrayList;

public class MotorDealership {

    protected ArrayList<Vehicle> vehicles;
    public MotorDealership(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicles(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int vehicleCount() {
        return  this.vehicles.size();
    }


//
}

