import java.util.ArrayList;

public class Passenger {

    private String name;
    private int numberOfBags;
    private ArrayList<Flight> flights;

   public Passenger(String name, int numberOfBags){
       this.name = name;
       this.numberOfBags = numberOfBags;
       this.flights = new ArrayList<Flight>();
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


}
