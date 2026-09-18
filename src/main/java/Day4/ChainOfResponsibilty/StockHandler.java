package Day4.ChainOfResponsibilty;

public class StockHandler extends OrderHandler {


    @Override
    public boolean handle(Order order) {
            if(order.getQuantity()>5){
                System.out.println("Stock Checking Failed");
                return false;
            }
        System.out.println("stock Chacking Passed");
            if(next!= null){
                return next.handle(order);

            }
            return true;
    }
}
