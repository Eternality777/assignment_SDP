package Strategy;

// Класс Заказ
public class Order {
    private double amount; // Сумма заказа
    private PaymentStrategy paymentStrategy; // Стратегия платежа

    // Конструктор, принимающий сумму заказа
    public Order(double amount) {
        this.amount = amount; // Устанавливаем сумму заказа
    }

    // Метод для установки стратегии платежа
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Устанавливаем стратегию
    }

    // Метод для расчета итоговой стоимости
    public double calculateTotal() {
        // Вызываем метод оплаты с установленной стратегией
        return paymentStrategy != null ? paymentStrategy.pay(amount) : amount;
    }
}
