package Observer;

// Интерфейс издателя новостей, управляющий подписчиками
public interface NewsPublisher {
    void addSubscriber(Observer subscriber);
    void removeSubscriber(Observer subscriber);
    void notifySubscribers(String category, String news);
}
