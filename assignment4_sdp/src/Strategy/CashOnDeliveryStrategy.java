package Strategy;

// Стратегия наложенного платежа
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Оплата наложенным платежом: " + amount + " рублей.");
        return amount; // Возвращаем ту же сумму
    }
}
