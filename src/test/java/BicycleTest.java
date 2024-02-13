import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BicycleTest {

    Bicycle bicycle;

    @BeforeEach
    public void setUp(){
        bicycle = new Bicycle(2,1,"Ground","Complete Ownership",60,20.50,2040);
    }

    @Test
    public void canAccelerate(){
        assertThat(bicycle.accelerate()).isEqualTo("Speeding up!");
    }

    @Test
    public void canBrake(){
        assertThat(bicycle.brake()).isEqualTo("Slowing the bicycle down!");
    }

    @Test
    public void canRentBicycle(){
        assertThat(bicycle.rentBicycle()).isEqualTo(0);
    }

    @Test
    public void canRentBicycleByTime(){
        assertThat(bicycle.rentBicycle(60)).isEqualTo(20.50);
    }

    @Test
    public void canBuyBicycle(){
        assertThat(bicycle.buyBicycle()).isEqualTo(2040);
    }
}