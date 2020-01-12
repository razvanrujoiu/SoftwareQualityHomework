import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String passengerName;
    private double passengerRating;
    private String passengerAddress;
    private List<Trip> tripsList;

    public Passenger() {
        this.passengerName = "";
        this.passengerRating = 0;
        this.passengerAddress = "";
        this.tripsList = new ArrayList<>();
    }

    public Passenger(String passengerName, double passengerRating, String clientAddress) {
        this.passengerName = passengerName;
        this.passengerRating = passengerRating;
        this.passengerAddress = clientAddress;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public double getPassengerRating() {
        return passengerRating;
    }

    public void setPassengerRating(double passengerRating) {
        this.passengerRating = passengerRating;
    }

    public String getPassengerAddress() {
        return passengerAddress;
    }

    public void setPassengerAddress(String passengerAddress) {
        this.passengerAddress = passengerAddress;
    }

    public List<Trip> getTripsList() {
        return tripsList;
    }

    public void setTripsList(List<Trip> tripsList) {
        this.tripsList = tripsList;
    }

}
