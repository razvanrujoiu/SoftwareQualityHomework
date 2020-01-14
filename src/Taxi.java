import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private String driverName;
    private String licensePlate;
    private double rating;
    List<Trip> tripsList;

    public Taxi() {
        this.driverName = "";
        this.licensePlate = "";
        this.rating = 0;
        this.tripsList = new ArrayList<>();
    }

    public Taxi(String driverName, String licensePlate, double rating) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.rating = rating;
    }

    public Taxi(String driverName, String licensePlate, double rating, List<Trip> tripsList) {
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.rating = rating;
        this.tripsList = tripsList;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Trip> getTripsList() {
        return tripsList;
    }

    public void setTripsList(List<Trip> tripsList) {
        this.tripsList = tripsList;
    }
}
