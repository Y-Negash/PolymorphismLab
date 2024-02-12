import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusTest {

    Bus bus;

    @BeforeEach
    public void setUp(){
        bus = new Bus(6,80,"Ground");
    }


}
