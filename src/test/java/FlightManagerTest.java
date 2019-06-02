import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;


    @Before
    public void SetUp() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "GLA123", "NYC", "GLA", "16:45");
        passenger1 = new Passenger("David", 1);
        passenger2 = new Passenger("Beth", 3);
        flightManager = new FlightManager(flight);
    }


        @Test
        public void canGetAvailableBaggageWeight(){
            assertEquals(40000, flightManager.getAvailableBaggageWeight());
        }

        @Test
        public void canGetMaximumBaggageAllowedPerPerson(){
            assertEquals(400, flightManager.maximumBaggageWeightPerPassenger());
        }

        @Test
        public void remainingPassengerWeightTest(){
            flight.addPassenger(passenger1);
            flight.addPassenger(passenger2);
            assertEquals(39920, flightManager.remainingBaggageWeight());
        }

        @Test
        public void canGetBookedBaggage(){
            flight.addPassenger(passenger1);
            flight.addPassenger(passenger2);
            assertEquals(80, flightManager.bookedBaggage());
        }

    }
