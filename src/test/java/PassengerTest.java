import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("David", 2);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("David", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
