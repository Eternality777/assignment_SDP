package Observer;

// Реализация подписчика - смартфон
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Спорт")) {
            System.out.println("Смартфон получил новость: " + news + " в категории: " + category);
        }
    }
}
