package Observer;

// Интерфейс наблюдателя, который будет получать уведомления
public interface Observer {
    void update(String category, String news);
}
