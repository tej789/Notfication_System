package Day3;

public class LoggingDecorator extends ShippingDecorator{


    public LoggingDecorator(ShippingService shippingService) {
    super(shippingService);
    }

    @Override
    public void ship(String product, String address){
        System.out.println("Shipping started ....");
        shippingService.ship(product,address);
        System.out.println("Shipping completed ....");
    }

}
