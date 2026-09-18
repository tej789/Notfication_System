package Day4.ChainOfResponsibilty;

public class FraudHandler extends OrderHandler {
    @Override
    public boolean handle(Order order) {
      if(order.isFraud()){
          System.out.println("Fraud Chacking Failed");
          return false;
      }

        System.out.println("Fraud Checking Passed");

        if(next!= null){
            return next.handle(order);

        }
        return true;
    }
}
