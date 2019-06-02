import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane;
    private Flight flight;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CIRRUSSR22);
        flight = new Flight(plane, "GLA123", "NYC", "GLA", "16:45");
        passenger1 = new Passenger("David", 1);
        passenger2 = new Passenger("David", 3);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("David", passenger1.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(1, passenger1.getNumberOfBags());
    }

    @Test
    public void noFlightAtStart(){
        assertEquals(false, passenger1.hasTicket());
    }

    @Test
    public void canGetBaggageWeightForPassenger(){
        assertEquals(60, passenger2.getBaggageWeightForPassenger());
    }


}
