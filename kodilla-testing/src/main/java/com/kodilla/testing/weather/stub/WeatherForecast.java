package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAvarage() {

        double sum = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            sum = sum + temperature.getValue();
        }

        return sum/temperatures.getTemperatures().size();
    }

    public Double calculateMedian() {

        int i = 1;
        int j = 0;

        Map<Integer, Double> resultMap = new HashMap<>();
        List<Double> temperatureForecast = new ArrayList<>(temperatures.getTemperatures().values());

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(i, temperature.getValue());
            i++;
        }

        Collections.sort(temperatureForecast);

        if(temperatureForecast.size() % 2 == 0) {
            j = temperatureForecast.size()/2;
            return (temperatureForecast.get(j-1)+temperatureForecast.get(j))/2;
        } else {
            j = temperatureForecast.size()/2;
            return temperatureForecast.get(j);
        }

    }

}
