package Strategy;

// Стратегия платежа через электронный кошелек
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Оплата через электронный кошелек: " + amount + " рублей.");
        return amount; // Возвращаем ту же сумму
    }
}
