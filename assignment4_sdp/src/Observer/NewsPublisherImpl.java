package Observer;
import java.util.ArrayList;
import java.util.List;

// Реализация издателя новостей
public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String category, String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }

    // Метод для публикации новостей
    public void publishNews(String category, String news) {
        System.out.println("Публикация новости: " + news + " в категории: " + category);
        notifySubscribers(category, news);
    }
}
