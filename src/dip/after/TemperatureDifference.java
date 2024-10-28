package dip.after;


import java.time.LocalDate;

public class TemperatureDifference {
    private TemperatureInformation weatherService;

    public TemperatureDifference(TemperatureInformation weatherService) {
        this.weatherService = weatherService;
    }

    public int getTemperatureDifference() {
        int todaysTemperature = weatherService.getTemperatureFor(LocalDate.now());
        int tomorrowsTemperature = weatherService.getTemperatureFor(LocalDate.now().plusDays(1));
        return todaysTemperature - tomorrowsTemperature;
    }
}
