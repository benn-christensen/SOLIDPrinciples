package dip.before;

import java.time.LocalDate;
import java.util.Random;

public class WeatherService {
    private Random random = new Random();
    public int getTemperatureFor(LocalDate date) {
        return random.nextInt(-10, 35);
    }
}
