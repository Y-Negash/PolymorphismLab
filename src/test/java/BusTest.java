import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusTest {

    Bus bus;

    @BeforeEach
    public void setUp() {
        bus = new Bus(6, 80, "Ground", 1.75, "Diesel", "Student");
    }

    @Test
    public void canAccelerate() {
        assertThat(bus.accelerate()).isEqualTo("Speeding up!");
    }

    @Test
    public void canBrake() {
        assertThat(bus.brake()).isEqualTo("Slowing the bus down!");
    }

    @Test void canGetPrice(){
        assertThat(bus.getPrice("Student")).isEqualTo(1.05);
    }
}
