package Day4.Observer;

import Day4.ChainOfResponsibilty.FraudHandler;
import Day4.ChainOfResponsibilty.InventoryHandler;
import Day4.ChainOfResponsibilty.Order;
import Day4.ChainOfResponsibilty.StockHandler;
import Day4.Strategy.DiscountFactory;
import Day4.Strategy.DiscountStrategy;

public class Main {
    public static void main(String[] args) {
        StockHandler stock = new StockHandler();
        FraudHandler fraud = new FraudHandler();
        InventoryHandler inventory = new InventoryHandler();

        stock.setNext(fraud);
        fraud.setNext(inventory);


        Order order = new Order(
                "Laptop",
                "REGULAR",
                2,
                false
        );


        double amount = 10000;

        DiscountStrategy strategy = DiscountFactory.getDiscount(order.getCustomerType());

        double discount = strategy.calculateDiscount(amount);

        System.out.println("Discount: ₹" + discount);





        OrderSubjects subject = new OrderSubjects();

        subject.addListener(new EmailListener());
        subject.addListener(new AnalyticsListener());
        subject.addListener(new AuditListener());


        subject.notifyListeners(order);



    }

}
