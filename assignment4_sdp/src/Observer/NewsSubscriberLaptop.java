package Observer;

// Реализация подписчика - ноутбук
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Наука")) {
            System.out.println("Ноутбук получил новость: " + news + " в категории: " + category);
        }
    }
}
