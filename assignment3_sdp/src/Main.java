import java.util.Arrays;
import java.util.List;
import Chain.PaymentA;
import Chain.PaymentB;
import Chain.PaymentC;
import Chain.PaymentHandler;
import Command.NextChannelCommand;
import Command.PreviousChannelCommand;
import Command.RemoteControl;
import Command.Television;
import Command.TurnOffCommand;
import Command.TurnOnCommand;
import Command.VolumeDownCommand;
import Command.VolumeUpCommand;
import Iterator.ArrayMovieCollection;
import Iterator.ListMovieCollection;
import Iterator.Iterator;
import Mediator.HomeMediatorImpl;
import Mediator.Sensor;
import Mediator.TemperatureSensor;
import Memento.Caretaker;
import Memento.TextEditor;
import Mediator.HumiditySensor;
import Mediator.LightSensor;


public class Main {
    public static void main(String[] args) {
        // Цепочка обязанностей
        System.out.println("-_- Цепочка обязанностей -_-");
        PaymentA paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);
        paymentA.handlePayment(150); // Пытаемся оплатить 150$

        // Команда
        System.out.println("\n-_- Комманда -_-");
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, new TurnOnCommand(tv));
        remote.setCommand(1, new TurnOffCommand(tv));
        remote.setCommand(2, new VolumeUpCommand(tv));
        remote.setCommand(3, new VolumeDownCommand(tv));
        remote.setCommand(4, new NextChannelCommand(tv));
        remote.setCommand(5, new PreviousChannelCommand(tv));

        remote.pressButton(0); // Включаем телевизор
        remote.pressButton(2); // Увеличиваем громкость
        remote.pressButton(5); // Переключаем на предыдущий канал
        remote.pressButton(3); // Уменьшаем громкость
        remote.pressButton(4); // Переключаем на следующий канал
        remote.pressButton(1); // Выключаем телевизор

        // Итератор
        System.out.println("\n-_- Итератор -_-");

        // Создаем коллекцию фильмов на основе списка
        List<String> movieList = Arrays.asList("Оппенгеймер", "Джокер");
        ListMovieCollection listMovieCollection = new ListMovieCollection(movieList);
        Iterator<String> listIterator = listMovieCollection.createIterator();
        while (listIterator.hasNext()) {
            System.out.println("Из листа: " + listIterator.next());
        }

        // Создаем коллекцию фильмов на основе массива
        String[] movieArray = {"Бизнес по-казахски", "Абай"};
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(movieArray);
        Iterator<String> arrayIterator = arrayMovieCollection.createIterator();
        while (arrayIterator.hasNext()) {
            System.out.println("Из массива: " + arrayIterator.next());
        }

        // Посредник
        System.out.println("\n-_- Посредник -_-");
        HomeMediatorImpl mediator = new HomeMediatorImpl();

        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        // Отправка данных от сенсоров
        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Печать отчета
        mediator.printReport();

        // Снимок
        System.out.println("\n-_- Снимок -_-");
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();
        editor.addText("Привет, ");
        caretaker.addMemento(editor.save());
        editor.addText("мир!");
        System.out.println("Текущий текст: " + editor.getText());
        editor.restore(caretaker.getMemento(0));
        System.out.println("Восстановленный текст: " + editor.getText());
    }
}
