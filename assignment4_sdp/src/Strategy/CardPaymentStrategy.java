package Strategy;

// Стратегия платежа картой
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Оплата картой: " + amount + " рублей.");
        return amount; // Возвращаем ту же сумму
    }
}
