package Day4.Observer;

import Day4.ChainOfResponsibilty.Order;


public class SmsListener implements OrderListener{
    @Override
    public void update(Order order) {
        System.out.println("SMS : Order Placed " + order.getProduct());
    }
}
