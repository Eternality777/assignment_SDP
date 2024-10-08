package Chain;

public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("PaymentC осуществила выплату в " + amount + " $");
        } else {
            System.out.println("PaymentB не может обработать платеж. Недостаточно средств.");
        }
    }
}
