package Day4.ChainOfResponsibilty;

public class Main {
    public static void main(String[] args) {
        StockHandler stock = new StockHandler();
        FraudHandler fraud = new FraudHandler();
        InventoryHandler inventory = new InventoryHandler();

        stock.setNext(fraud);
        fraud.setNext(inventory);


        Order order = new Order(
                "Laptop",
                "VIP",
                2,
                false
        );

        boolean accepted = stock.handle(order);

    }
}
