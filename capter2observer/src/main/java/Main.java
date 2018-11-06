import observer.CurrentConditionDisplay;
import subject.ISubject;
import subject.WeatherData;

/**
 * @author yanzy
 * @date 2018/11/6 上午9:47
 * @description
 */
public class Main {
    public static void main(String[] args) {
        ISubject weatherData = new WeatherData();
        weatherData.setMeasurements(1F, 2F, 3F);
        System.out.println("no observer subscribe subject now!\n");
        weatherData.notifyObservers();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        currentConditionDisplay.subscribe();
        weatherData.notifyObservers();

        currentConditionDisplay.unsubscribe();
        weatherData.notifyObservers();
    }
}
