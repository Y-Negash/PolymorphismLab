import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorDealershipTest {

    MotorDealership motorDealership;

    @BeforeEach
    public void setUp(){
        motorDealership = new MotorDealership();
    }

    @Test
    public void canCountVehicles(){
        assertThat(motorDealership.countVehicles()).isEqualTo(0);
    }
    @Test
    public void canAddVehicles(){
        Vehicle vehicle = new Bus(6, 90, "Ground", 1.75, "hybrid", "Standard");
        motorDealership.addVehicles(vehicle);
        assertThat(motorDealership.countVehicles()).isEqualTo(1);

    }
}
