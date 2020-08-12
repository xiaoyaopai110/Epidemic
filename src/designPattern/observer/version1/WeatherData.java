package designPattern.observer.version1;

import java.util.ArrayList;
import java.util.List;

/*
* 需求描述：观察者模式，将最新的气象信息，发送给多个不同的布告板
* */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure ;

    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
               observers.get(i).update(temperature,humidity,pressure);
        }
    }



    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

}
