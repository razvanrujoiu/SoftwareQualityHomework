import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PassengerTestCase {

    private static final String PASSENGER_NAME = "Razvan";


    @Test
    public void testSetPassengerName() {
        Passenger passenger = new Passenger();
        passenger.setPassengerName(PASSENGER_NAME);
        assertEquals(PASSENGER_NAME, passenger.getPassengerName());
    }


}