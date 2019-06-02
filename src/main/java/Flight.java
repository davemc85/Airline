import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public int availableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public void assignUniqueSeatNumber(Passenger passenger){
        Random random = new Random();
        int seatNumber = random.nextInt(this.plane.getCapacity()) + 1;
        while (passenger.getSeatNumber() == 0){
            for (int i = 0; i < this.passengerCount() -1; i++){
                if (this.passengers.get(i).getSeatNumber() == seatNumber){
                    seatNumber = random.nextInt(this.plane.getCapacity()) + 1;
                    i = -1;
                }
            }
            passenger.assignSeatNumber(seatNumber);
        }
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > passengerCount()){
            this.passengers.add(passenger);
            this.assignUniqueSeatNumber(passenger);
        }
    }
}
