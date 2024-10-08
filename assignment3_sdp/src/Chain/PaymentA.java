package Chain;

public class PaymentA extends PaymentHandler {
    private int balance = 100;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("PaymentA осуществила выплату в " + amount + " $");
        } else {
            System.out.println("PaymentA не может обработать платеж. Переход к PaymentB...");
            if (nextHandler != null) {
                nextHandler.handlePayment(amount);
            }
        }
    }
}
