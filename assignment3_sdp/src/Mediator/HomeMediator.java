package Mediator;

public interface HomeMediator {
    void registerSensor(Sensor sensor);
    void collectData();
    void printReport();
}
