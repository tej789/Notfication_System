package Day4.ChainOfResponsibilty;

public class InventoryHandler extends OrderHandler {

    @Override
    public boolean handle(Order order) {

        if (order.getQuantity() >= 4) {

            System.out.println("Inventory hold failed!");

            return false;
        }

        System.out.println("Inventory hold successful.");

        if (next != null) {
            return next.handle(order);
        }

        return true;
    }
}