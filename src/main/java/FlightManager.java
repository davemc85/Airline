import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int getAvailableBaggageWeight() {
        return flight.getPlane().getTotalWeight() / 2;
    }

    public int maximumBaggageWeightPerPassenger() {
        return getAvailableBaggageWeight() / flight.getPlane().getCapacity();
    }


    public int bookedBaggage() {
        ArrayList<Passenger> passengers =  this.flight.getPassengers();
        int baggageCount = 0;
        for (Passenger passenger : passengers){
            baggageCount += passenger.getNumberOfBags();
        }
        return baggageCount * 20; // 20 being the standard weight of each bag
    }

    public int remainingBaggageWeight() {
        return getAvailableBaggageWeight() - bookedBaggage();
    }



}