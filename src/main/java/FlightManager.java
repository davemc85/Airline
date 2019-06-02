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

    public ArrayList<Passenger> sortPassengersBySeatNumber(Flight flight) {
        ArrayList<Passenger> sortedPassengers = flight.getPassengers();
        Passenger temp;
        for (int i = sortedPassengers.size() -1; i > 0; i--){

            boolean isSorted = true;

            for (int j = 0; j < i; j++){
                if (sortedPassengers.get(j + 1).getSeatNumber() < sortedPassengers.get(j).getSeatNumber()){
                    isSorted = false;
                    temp = sortedPassengers.get(j + 1);
                    sortedPassengers.set(j + 1, sortedPassengers.get(j));
                    sortedPassengers.set(j, temp);
                }
            }
            if (isSorted){
                break;
            }
        }
        return sortedPassengers;
    }




}