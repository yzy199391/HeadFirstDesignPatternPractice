package design.practice.weather.data.displayer.observer;

/**
 * @author yanzy
 * @date 2018/11/5 上午9:27
 * @description 观察者接口
 */
public interface IObserver {
    /**
     * 接收主题通知的内容更新
     * @param temperature 气温
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temperature, float humidity, float pressure);
}
