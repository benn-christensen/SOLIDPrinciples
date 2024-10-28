package dip.before;

import java.time.LocalDate;

public class TemperatureDifference {
    private WeatherService weatherService;

    public TemperatureDifference() {
        weatherService = new WeatherService();
    }

    public int getTemperatureDifference() {
        int todaysTemperature = weatherService.getTemperatureFor(LocalDate.now());
        int tomorrowsTemperature = weatherService.getTemperatureFor(LocalDate.now().plusDays(1));
        return todaysTemperature - tomorrowsTemperature;
    }
}
