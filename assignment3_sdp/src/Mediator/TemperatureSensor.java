package Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void sendData() {
        mediator.collectData();
    }
}
