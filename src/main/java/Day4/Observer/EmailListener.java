package Day4.Observer;

import Day4.ChainOfResponsibilty.Order;

public class EmailListener implements OrderListener{
    @Override
    public void update(Order order) {
        System.out.println("Email : Order Placed " + order.getProduct());
    }
}
