package design.practice.weather.data.displayer.subject;

import design.practice.weather.data.displayer.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzy
 * @date 2018/11/5 上午9:29
 * @description 主题接口的一个实现类--天气数据接收器
 */
public class WeatherData implements ISubject {
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observers.indexOf(observer) >= 0) {
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            o.update(this.temperature, this.humidity, this.pressure);
        });
    }

    //@Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
