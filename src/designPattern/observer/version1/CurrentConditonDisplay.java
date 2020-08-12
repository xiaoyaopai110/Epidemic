package designPattern.observer.version1;

public class CurrentConditonDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure ;
    private Subject subject;
    public CurrentConditonDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(""+temperature+":"+humidity+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity= humidity;
        this.pressure = pressure;
        display();
    }

}
