import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;


    @Before
    public void SetUp() {
        plane = new Plane(PlaneType.CIRRUSSR22);
        flight = new Flight(plane, "GLA123", "NYC", "GLA", "16:45");
        passenger1 = new Passenger("David", 1, 0);
        passenger2 = new Passenger("Beth", 3, 0);
        passenger3 = new Passenger("Gillian", 3, 0);
        passenger4 = new Passenger("Stephen", 3, 0);
        flightManager = new FlightManager(flight);
    }


    @Test
    public void canGetAvailableBaggageWeight(){
        assertEquals(5000, flightManager.getAvailableBaggageWeight());
    }

    @Test
    public void canGetMaximumBaggageAllowedPerPerson(){
        assertEquals(1250, flightManager.maximumBaggageWeightPerPassenger());
    }

    @Test
    public void remainingPassengerWeightTest(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(4920, flightManager.remainingBaggageWeight());
    }

    @Test
    public void canGetBookedBaggage(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(80, flightManager.bookedBaggage());
    }

    @Test
    public void canSortPassengersBySeatNumber(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        ArrayList<Passenger> sortedPassengers = flightManager.sortPassengersBySeatNumber(flight);
        assertEquals(1, sortedPassengers.get(0).getSeatNumber());
        assertEquals(2, sortedPassengers.get(1).getSeatNumber());
        assertEquals(3, sortedPassengers.get(2).getSeatNumber());
        assertEquals(4, sortedPassengers.get(3).getSeatNumber());
    }


}
