package Day4.ChainOfResponsibilty;

public class PaymentHandler extends OrderHandler {

    @Override
    public boolean handle(Order order) {

        System.out.println("Payment check passed");

        if (next != null) {
            return next.handle(order);
        }

        return true;
    }
}