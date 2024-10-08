package Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void sendData() {
        mediator.collectData();
    }
}
