package Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors = new ArrayList<>();
    private StringBuilder report = new StringBuilder();

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public void collectData() {
        report.setLength(0); // Сбрасываем предыдущий отчет
        for (Sensor sensor : sensors) {
            // Собираем данные (здесь мы просто добавим данные в отчет)
            report.append(sensor.getClass().getSimpleName()).append(" собрал данные.\n");
        }
    }

    @Override
    public void printReport() {
        System.out.println("Отчет домашнего посредника");
        System.out.println(report.toString());
    }
}
