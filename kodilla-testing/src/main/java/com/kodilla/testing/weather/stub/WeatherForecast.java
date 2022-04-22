package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature :
            temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(),temperature.getValue() +1.0);
        }
    return resultMap;
    }

    public double temperatureAverage() {
        double sum = 0;
        for(double a : temperatures.getTemperatures().values()){
           sum += a;
        }
        sum = (sum/temperatures.getTemperatures().size());
        return sum;
    }

    public double temperatureMedian(){
        List<Double> medianList = new ArrayList<>();
        for(Map.Entry<String, Double> temperature:
            temperatures.getTemperatures().entrySet()){
            medianList.add(temperature.getValue());
        }
        Collections.sort(medianList);

        double result = 0;
        if(medianList.size() % 2 != 0){
            result = (medianList.get(medianList.size()/2));
        } else {
            result = (medianList.get(medianList.size()/2) + medianList.get(medianList.size()/2 -1)) / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = 5/2;
        System.out.println(result);
    }
}
