package Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void sendData() {
        mediator.collectData();
    }
}
