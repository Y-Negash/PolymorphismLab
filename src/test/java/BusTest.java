import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusTest {

    Bus bus;

    @BeforeEach
    public void setUp(){
        bus = new Bus(6,80,"Ground",1.75,"diesel","Standard");
    }

    @Test
    public void canAccelerate(){
        assertThat(bus.accelerate()).isEqualTo("Speeding up!");
    }

    @Test
    public void canBrake(){
        assertThat(bus.brake()).isEqualTo("Slowing down!");
    }

    @Test
    public void canGetPrice(){
        if(bus.oysterType == "Standard"){
        assertThat(bus.getPrice()).isEqualTo(1.75);
    }

}
