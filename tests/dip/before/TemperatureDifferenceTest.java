package dip.before;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureDifferenceTest {

    @Test
    public void testGetTemperatureDifference() {
        TemperatureDifference temperatureDifference = new TemperatureDifference();
        int difference = temperatureDifference.getTemperatureDifference();
        assertEquals(-5, difference);
    }
}