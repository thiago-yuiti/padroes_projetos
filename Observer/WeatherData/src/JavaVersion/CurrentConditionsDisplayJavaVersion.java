package JavaVersion;
import WeatherData.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayJavaVersion implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayJavaVersion(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degress and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
    if (obs instanceof WeatherDataJavaVersion) {
        WeatherDataJavaVersion weatherDataJavaVersion = (WeatherDataJavaVersion) obs;
        this.temperature = weatherDataJavaVersion.getTemperature();
        this.humidity = weatherDataJavaVersion.getHumidity();
        display();
    }
    }
}
