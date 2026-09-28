package Day3;

public class LoggingDecorator implements ShippingService {

    private final ShippingService shippingService;

    public LoggingDecorator(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @Override
    public void ship(String product, String address) {
        System.out.println("Shipping started");
        shippingService.ship(product, address);
        System.out.println("Shipping completed");
    }
}
