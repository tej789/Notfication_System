package Day3;

public class RetryDecorator implements ShippingService {

    private final ShippingService shippingService;

    public RetryDecorator(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @Override
    public void ship(String product, String address) {
        for (int i = 0; i < 3; i++) {
            try {
                shippingService.ship(product, address);
                return;
            } catch (Exception e) {
                System.out.println("Failed");
            }
        }

        throw new RuntimeException("Shipping failed after 3 Tries");
    }
}
