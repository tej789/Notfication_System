package Day4.Strategy;

import Day4.ChainOfResponsibilty.*;

public class Main {
    public static void main(String[] args) {
        StockHandler stock = new StockHandler();
        FraudHandler fraud = new FraudHandler();
        InventoryHandler inventory = new InventoryHandler();
        PaymentHandler payment = new PaymentHandler();
        stock.setNext(fraud);
        fraud.setNext(inventory);


        Order order = new Order(
                "Laptop", "REGULAR", 2, false
        );


        double amount = 10000;

        DiscountStrategy strategy = DiscountFactory.getDiscount(order.getCustomerType());
        double discount = strategy.calculateDiscount(amount);

            System.out.println("Discount: " + discount);

    }
}
