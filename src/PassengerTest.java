import static org.junit.jupiter.api.Assertions.*;


class PassengerTest {

    private static final String PASSENGER_NAME = "Razvan";

    @org.junit.jupiter.api.Test
    void setPassengerName() {
        Passenger passenger = new Passenger();
        passenger.setPassengerName(PASSENGER_NAME);
        assertEquals(PASSENGER_NAME, passenger.getPassengerName());
    }

    @org.junit.jupiter.api.Test
    void setPassengerRating() {
    }
}