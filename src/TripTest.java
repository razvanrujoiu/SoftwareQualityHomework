import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TripTest {

    private static final Passenger PASSENGER = new Passenger("Razvan", 5, "Chibzuintei, Nr 2");
    private static final Taxi TAXI = new Taxi("Luka Magnotta", "B123LKA", 4.5);

    private static final double TIME_IN_MINUTES = 15;
    private static final double DISTANCE_IN_KILOMETERS = 4;

    @Test
    public void testTripPassangerConstructor() {
        Trip trip = new Trip(PASSENGER, TIME_IN_MINUTES, DISTANCE_IN_KILOMETERS);
        assertEquals(TIME_IN_MINUTES, trip.getTimeInMinutes(), 0);
        assertEquals(DISTANCE_IN_KILOMETERS, trip.getDistanceInKilometers(), 0);
        assertEquals(PASSENGER, trip.getPassenger());
    }

    @Test
    public void testTripPrice() {
        Trip trip = new Trip(PASSENGER, TIME_IN_MINUTES, DISTANCE_IN_KILOMETERS);
        trip.setPriceInLei(trip.getTimeInMinutes(), trip.getDistanceInKilometers());
        assertEquals(22.5, trip.getPriceInLei(), 2);
    }

    @Test
    public void testTripTaxiConstructor() {
        Trip trip = new Trip(TAXI, TIME_IN_MINUTES, DISTANCE_IN_KILOMETERS);
        assertEquals(TIME_IN_MINUTES, trip.getTimeInMinutes(), 0);
        assertEquals(DISTANCE_IN_KILOMETERS, trip.getDistanceInKilometers(), 0);
        assertEquals(TAXI, trip.getTaxi());
    }

    @Test
    public void testTripTaxiPassangerContructor() {
        Trip tripPassanger = new Trip(PASSENGER, TIME_IN_MINUTES, DISTANCE_IN_KILOMETERS);
        Trip tripTaxi = new Trip(TAXI, TIME_IN_MINUTES, DISTANCE_IN_KILOMETERS);
        assertEquals(TAXI, tripTaxi.getTaxi());
        assertEquals(PASSENGER, tripPassanger.getPassenger());

    }



}