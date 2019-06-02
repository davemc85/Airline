import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CIRRUSSR22);
        flight = new Flight(plane, "GLA123", "NYC", "GLA", "16:45");
        passenger1 = new Passenger("David", 1, 0);
        passenger2 = new Passenger("Beth", 2, 0);
        passenger3 = new Passenger("Gillian", 2, 0);
        passenger4 = new Passenger("Stephen", 1, 0);
        passenger5 = new Passenger("Ken", 2, 0);
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void passengerListStartsAt0(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("GLA123", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("NYC", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("16:45", flight.getDepartureTime());
    }

    @Test
    public void canShowAvailableNumberOfSeats(){
        assertEquals(4, flight.availableSeats());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
        assertEquals(3, flight.availableSeats());
    }

    @Test
    public void canNotAddPassengerNoSpaces(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        assertEquals(4, flight.passengerCount());
        assertEquals(0, flight.availableSeats());

    }

    @Test
    public void canAddSeatNumber(){
        assertEquals(0, passenger1.getSeatNumber());
        flight.addPassenger(passenger1);
        System.out.println("Showing that the seat number is not 0 : new seat is " + passenger1.getSeatNumber());
    }

    @Test
    public void canAddUniqueSeatNumbers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        System.out.println("passenger 1: Seat number is " + passenger1.getSeatNumber());
        System.out.println("passenger 2: Seat number is " + passenger2.getSeatNumber());
        System.out.println("passenger 3: Seat number is " + passenger3.getSeatNumber());
        System.out.println("passenger 4: Seat number i  " + passenger4.getSeatNumber());
    }


}
