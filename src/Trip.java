public class Trip {
    private Passenger passenger;
    private Taxi taxi;
    private double timeInMinutes;
    private double distanceInKilometers;
    private double priceInLei;

    public Trip() {
        this.passenger = new Passenger();
        this.taxi = new Taxi();
        this.timeInMinutes = 0;
        this.distanceInKilometers = 0;
        this.priceInLei = 0;
    }

    public Trip(Passenger passenger) {
        this.passenger = passenger;
    }

    public Trip(Taxi taxi) {
        this.taxi = taxi;
    }

    public Trip(Taxi taxi, double timeInMinutes, double distanceInKilometers) {
        this.taxi = taxi;
        this.timeInMinutes = timeInMinutes;
        this.distanceInKilometers = distanceInKilometers;
    }

    public Trip(Passenger passenger, double timeInMinutes, double distanceInKilometers) {
        this.passenger = passenger;
        this.timeInMinutes = timeInMinutes;
        this.distanceInKilometers = distanceInKilometers;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public double getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(double timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public double getDistanceInKilometers() {
        return distanceInKilometers;
    }

    public void setDistanceInKilometers(double distanceInKilometers) {
        this.distanceInKilometers = distanceInKilometers;
    }

    public double getPriceInLei() {
        return priceInLei;
    }

    public void setPriceInLei(double timeInMinutes, double distanceInKilometers) {
        this.priceInLei = timeInMinutes * 1.1 + distanceInKilometers * 1.5;
    }
}

