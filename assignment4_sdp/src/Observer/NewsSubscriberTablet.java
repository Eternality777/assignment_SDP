package Observer;

// Реализация подписчика - планшет
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Планшет получил новость: " + news + " в категории: " + category);
    }
}
