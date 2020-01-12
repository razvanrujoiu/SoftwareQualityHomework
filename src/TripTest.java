import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TripTest {

    private static final Passenger PASSENGER = new Passenger("Razvan", 5, "Chibzuintei, Nr 2");
    private static final Trip TRIP = new Trip(PASSENGER, 15, 4);

    @Test
    public void testTripConstructor() {
        assertEquals(PASSENGER.getPassengerName(), TRIP.getPassenger().getPassengerName());
    }

    @Test
    public void testTripPrice() {
        TRIP.setPriceInLei(TRIP.getTimeInMinutes(), TRIP.getDistanceInKilometers());
        assertEquals(22.5, TRIP.getPriceInLei(), 2);
    }


}