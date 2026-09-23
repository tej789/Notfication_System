package Day3.Facade;

class PaymentService {
    public void pay() {
        System.out.println("Payment done");
    }
}

class InventoryService{
    public void update(){
        System.out.println("Stock updated");
    }
}

public class Facade {

    private PaymentService payment = new PaymentService();
    private InventoryService inventory = new InventoryService();

    public void placeOrder(){
        payment.pay();
        inventory.update();
    }



    public static void main(String[] args){
        Facade facade = new Facade();
        facade.placeOrder();
    }
}
