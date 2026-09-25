package Day4.Observer;

import Day4.ChainOfResponsibilty.*;
import Day4.Strategy.DiscountFactory;
import Day4.Strategy.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        StockHandler stock = new StockHandler();
        FraudHandler fraud = new FraudHandler();
        InventoryHandler inventory = new InventoryHandler();
        PaymentHandler payment = new PaymentHandler();
        stock.setNext(fraud);
        fraud.setNext(inventory);


        Order order = new Order("Laptop", "REGULAR", 2, false
        );


        stock.handle(order);


        double amount = 10000;

        DiscountStrategy strategy = DiscountFactory.getDiscount(order.getCustomerType());

        double discount = strategy.calculateDiscount(amount);

        System.out.println("Discount: " + discount);


        OrderSubjects subject = new OrderSubjects();

        EmailListener e = new EmailListener();

        subject.addListener(e);
        subject.addListener(new AnalyticsListener());
        subject.addListener(new AuditListener());
        subject.removeListener(e);

        subject.notifyListeners(order);



    }

}
