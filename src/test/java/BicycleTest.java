import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BicycleTest {

    Bicycle bicycle;

    @BeforeEach
    public void setUp(){
        bicycle = new Bicycle(2,1,"Ground","Complete Ownership",1.70,2040);
    }

    @Test
    public void canAccelerate(){
        assertThat(bicycle.accelerate()).isEqualTo("Speeding up!");
    }

    @Test
    public void canBrake(){
        assertThat(bicycle.brake()).isEqualTo("Slowing down!");
    }

    @Test
    public void canRentBicycle(){
        assertThat(bicycle.rentBicycle()).isEqualTo(0);
    }

    @Test
    public void canBuyBicycle(){
        assertThat(bicycle.buyBicycle()).isEqualTo(2040);
    }
}