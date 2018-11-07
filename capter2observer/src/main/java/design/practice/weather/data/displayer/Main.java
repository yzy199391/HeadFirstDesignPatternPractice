package design.practice.weather.data.displayer;

import design.practice.weather.data.displayer.observer.CurrentConditionDisplay;
import design.practice.weather.data.displayer.subject.WeatherData;

/**
 * @author yanzy
 * @date 2018/11/6 上午9:47
 * @description
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(1F, 2F, 3F);
        System.out.println("no design.practice.weather.data.displayer.observer subscribe design.practice.weather.data.displayer.subject now!\n");

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        currentConditionDisplay.subscribe();
        weatherData.setMeasurements(10F, 20F, 30F);

        currentConditionDisplay.unsubscribe();
        weatherData.notifyObservers();
    }
}
