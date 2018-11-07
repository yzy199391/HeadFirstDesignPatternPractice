package design.practice.weather.data.displayer.subject;

import design.practice.weather.data.displayer.observer.IObserver;

/**
 * @author yanzy
 * @date 2018/11/5 上午9:26
 * @description 主题接口
 */
public interface ISubject {
    /**
     * 观察者订阅主题
     * @param observer
     */
    void registerObserver(IObserver observer);

    /**
     * 观察者取消订阅
     * @param observer
     */
    void removeObserver(IObserver observer);

    /**
     * 通知所有观察者主题的更新内容
     */
    void notifyObservers();

    /**
     * 设置观测值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    //void setMeasurements(float temperature, float humidity, float pressure);
}
