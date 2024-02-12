import org.junit.jupiter.api.BeforeEach;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Vehicle(4,36,"Ground");
    }
}
