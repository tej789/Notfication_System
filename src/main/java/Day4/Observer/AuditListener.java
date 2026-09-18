package Day4.Observer;

import Day4.ChainOfResponsibilty.Order;

public class AuditListener implements OrderListener{
    @Override
    public void update(Order order) {
        System.out.println("Audit : Order Placed " + order.getProduct());

    }
}
