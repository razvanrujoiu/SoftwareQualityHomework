import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTestCase {

    private static final String PASSENGER_NAME = "Razvan";
    private static final double RATING = 4;
    private static final String PASSENGER_ADDRESS = "Bd Ion Mihalache, Nr 10";

    @Test
    public void testSetPassengerName() {
        Passenger passenger = new Passenger();
        passenger.setPassengerName(PASSENGER_NAME);
        assertEquals(PASSENGER_NAME, passenger.getPassengerName());
    }

    @Test
    public void testPassengerConstructor() {
        Passenger passenger = new Passenger(PASSENGER_NAME, RATING, PASSENGER_ADDRESS);
        assertEquals(PASSENGER_NAME, passenger.getPassengerName());
        assertEquals(RATING, passenger.getPassengerRating(), 0);
        assertEquals(PASSENGER_ADDRESS, passenger.getPassengerAddress());
    }

}