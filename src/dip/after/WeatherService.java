package dip.after;

import java.time.LocalDate;
import java.util.Random;

public class WeatherService implements TemperatureInformation {
    private Random random = new Random();

    public int getTemperatureFor(LocalDate date) {
        return random.nextInt(-10, 35);
    }
}
