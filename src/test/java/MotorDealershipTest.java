import interfaces.ISell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorDealershipTest {

    MotorDealership motorDealership;
    BicycleSparePart sparePart;
    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        motorDealership = new MotorDealership();
        sparePart = new BicycleSparePart("Wheels","Cannondale", 5060);
        vehicle = new Bus(6, 90, "Ground", 1.75, "hybrid", "Standard");
    }

    @Test
    public void canCountVehicles(){
        assertThat(motorDealership.productCount()).isEqualTo(0);
    }

    @Test
    public void canAddProducts(){
        motorDealership.addProducts(vehicle);
        motorDealership.addProducts(sparePart);
        assertThat(motorDealership.productCount()).isEqualTo(2);

    }

}
