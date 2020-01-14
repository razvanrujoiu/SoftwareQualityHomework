import org.junit.Test;

import static org.junit.Assert.*;

public class TaxiTest {

    public static final String LICENSE_PLATE = "B328RZV";
    public static final double RATING = 4.5;

    @Test
    public void testSetLicensePlate() {
        Taxi taxi = new Taxi();
        taxi.setLicensePlate(LICENSE_PLATE);
        assertEquals(LICENSE_PLATE, taxi.getLicensePlate());
    }

    @Test
    public void setRating() {
        Taxi taxi = new Taxi();
        taxi.setRating(RATING);
        assertEquals(RATING, taxi.getRating(), 1);
    }
}