package Day4.Observer;

import Day4.ChainOfResponsibilty.Order;

public class AnalyticsListener implements OrderListener{
    @Override
    public void update(Order order) {
        System.out.println("Analytics : Order Placed " + order.getProduct());
    }
}
