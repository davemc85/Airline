import java.util.ArrayList;

public class Passenger {

    private String name;
    private int numberOfBags;
    private ArrayList<Flight> flights;
    private int seatNumber;

   public Passenger(String name, int numberOfBags, int seatNumbe){
       this.name = name;
       this.numberOfBags = numberOfBags;
       this.flights = new ArrayList<Flight>();
       this.seatNumber = 0;
   }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public boolean hasTicket() {
        if (this.flights.size() > 0) {
            return true;
        }
        return false;
    }

    public int getBaggageWeightForPassenger(){
       return this.numberOfBags * 20;
    }

    public void assignSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber(){
       return this.seatNumber;
    }

}
