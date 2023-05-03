package JavaVersion;
import WeatherData.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }
    @Override
    public void display() {

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataJavaVersion) {
            WeatherDataJavaVersion weatherDataJavaVersion = (WeatherDataJavaVersion) o;
            lastPressure = currentPressure;
            currentPressure = weatherDataJavaVersion.getPressure();
            display();
        }
        }
}
