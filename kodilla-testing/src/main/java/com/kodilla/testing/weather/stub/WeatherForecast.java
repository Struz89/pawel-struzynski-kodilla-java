package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

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

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(i, temperature.getValue());
            i++;
        }

        if(resultMap.size() % 2 == 0) {
            j = resultMap.size()/2;
            return (resultMap.get(j)+resultMap.get(j+1))/2;
        } else {
            j = resultMap.size()/2;
            return resultMap.get(j+1);
        }

    }

}
