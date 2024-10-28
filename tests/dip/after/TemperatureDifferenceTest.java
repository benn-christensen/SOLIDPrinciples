package dip.after;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureDifferenceTest {

    @Test
    void getTemperatureDifference() {

        TemperatureDifference temperatureDifference = new TemperatureDifference(new FakeWeatherService());
        int difference = temperatureDifference.getTemperatureDifference();
        assertEquals(5, difference);
    }

    class FakeWeatherService implements TemperatureInformation {
        private int[] temperatures = {21, 26};
        private int index = 0;
        @Override
        public int getTemperatureFor(LocalDate date) {
            return temperatures[index++];
        }
    }
}