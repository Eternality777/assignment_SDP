package Chain;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handlePayment(int amount);
}
