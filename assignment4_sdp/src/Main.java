import Observer.*; // Импортируем все классы из пакета Observer
import State.*; // Импортируем все классы из пакета State
import Strategy.*; // Импортируем все классы из пакета Strategy
import TemplateMethod.*; // Импортируем все классы из пакета TemplateMethod
import Visitor.*; // Импортируем все классы из пакета Visitor
import java.util.ArrayList;
import java.util.List;

// Главный класс, который запускает всю программу
public class Main {
    public static void main(String[] args) {
        // 1. Реализация паттерна Наблюдатель (Observer)
        System.out.println("-_- Паттерн Наблюдатель -_-");
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl(); // Создаём издателя новостей

        // Создаём подписчиков
        NewsSubscriberSmartphone smartphoneSubscriber = new NewsSubscriberSmartphone();
        NewsSubscriberLaptop laptopSubscriber = new NewsSubscriberLaptop();
        NewsSubscriberTablet tabletSubscriber = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю
        newsPublisher.addSubscriber(smartphoneSubscriber); // Исправлено с subscribe на addSubscriber
        newsPublisher.addSubscriber(laptopSubscriber); // Исправлено с subscribe на addSubscriber
        newsPublisher.addSubscriber(tabletSubscriber); // Исправлено с subscribe на addSubscriber

        // Публикуем новости
        newsPublisher.publishNews("Спорт", "Спортивное событие");
        newsPublisher.publishNews("Наука", "Научное открытие");
        newsPublisher.publishNews("Общее", "Общее событие");

        // 2. Реализация паттерна Состояние (State)
        System.out.println("\n-_- Паттерн Состояние -_-");
        Player player = new Player(); // Создаём экземпляр плеера
        player.play(); // Пробуем воспроизвести в состоянии остановки
        player.pause(); // Пауза
        player.stop(); // Остановка

        // 3. Реализация паттерна Стратегия (Strategy)
        System.out.println("\n-_- Паттерн Стратегия -_-");
        Order order = new Order(1000); // Создаём заказ на 1000 рублей

        // Устанавливаем разные стратегии оплаты
        order.setPaymentStrategy(new CardPaymentStrategy()); // Устанавливаем стратегию оплаты картой
        System.out.println("Итоговая стоимость с банковской картой: " + order.calculateTotal()); // Расчёт итоговой стоимости

        order.setPaymentStrategy(new WalletPaymentStrategy()); // Устанавливаем стратегию оплаты электронным кошельком
        System.out.println("Итоговая стоимость с электронным кошельком: " + order.calculateTotal()); // Расчёт итоговой стоимости

        order.setPaymentStrategy(new CashOnDeliveryStrategy()); // Устанавливаем стратегию наложенного платежа
        System.out.println("Итоговая стоимость с наложенным платежом: " + order.calculateTotal()); // Расчёт итоговой стоимости

        // 4. Реализация паттерна Шаблонный метод (Template Method)
        System.out.println("\n-_- Паттерн Шаблонный метод -_-");
        QualityCheck foodQualityCheck = new FoodQualityCheck(); // Создаём проверку для продуктов питания
        foodQualityCheck.check(); // Запускаем проверку

        QualityCheck electronicsQualityCheck = new ElectronicsQualityCheck(); // Создаём проверку для электроники
        electronicsQualityCheck.check(); // Запускаем проверку

        // 5. Реализация паттерна Посетитель (Visitor)
        System.out.println("\n-_- Паттерн Посетитель -_-");
        List<File> files = new ArrayList<>(); // Список файлов
        files.add(new TextFile("document.txt")); // Добавляем текстовый файл
        files.add(new ExecutableFile("program.exe")); // Добавляем исполняемый файл

        // Создаём экземпляры посетителей
        Visitor antivirusVisitor = new AntivirusVisitor(); // Посетитель для антивирусной проверки
        Visitor reportVisitor = new ReportVisitor(); // Посетитель для генерации отчётов

        // Запускаем проверку антивирусом
        System.out.println("Проверка файлов антивирусом:");
        for (File file : files) {
            file.accept(antivirusVisitor); // Вызываем метод accept для каждого файла
        }

        // Генерируем отчёт о проверке
        System.out.println("\nГенерация отчётов:");
        for (File file : files) {
            file.accept(reportVisitor); // Вызываем метод accept для каждого файла
        }
    }
}
