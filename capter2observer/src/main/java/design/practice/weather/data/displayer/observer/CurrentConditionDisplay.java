package design.practice.weather.data.displayer.observer;


import design.practice.weather.data.displayer.subject.ISubject;

/**
 * @author yanzy
 * @date 2018/11/6 上午9:36
 * @description 展示面板--气温和湿度
 */
public class CurrentConditionDisplay implements IObserver, IDisplayElement {
    private ISubject subject;
    private Float temperature;
    private Float humidity;

    public CurrentConditionDisplay(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void display() {
        if (this.temperature == null && this.humidity == null) {
            System.out.println("no message from design.practice.weather.data.displayer.subject!\n");
        }
        System.out.println("current conditions: -" + this.temperature + "F- degrees and -" + this.humidity + "%- humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        this.display();
    }

    public void subscribe() {
        this.subject.registerObserver(this);
        System.out.println("success to subscribe " + subject);
    }

    public void unsubscribe() {
        this.subject.removeObserver(this);
        System.out.println("success to unsubscribe " + subject);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
