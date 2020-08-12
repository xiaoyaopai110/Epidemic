package designPattern.observer.version1;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        CurrentConditonDisplay c = new CurrentConditonDisplay(w);
        w.setMeasurements(1,2,3);
    }
}
