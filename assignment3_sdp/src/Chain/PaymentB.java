package Chain;

public class PaymentB extends PaymentHandler {
    private int balance = 300;

    @Override
    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("PaymentB осуществила выплату в " + amount + " $");
        } else {
            System.out.println("PaymentB не может обработать платеж. Переход к PaymentC...");
            if (nextHandler != null) {
                nextHandler.handlePayment(amount);
            }
        }
    }
}
