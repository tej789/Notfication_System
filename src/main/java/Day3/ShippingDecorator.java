package Day3;

public class ShippingDecorator implements ShippingService{

    protected ShippingService shippingService;

    public ShippingDecorator(ShippingService shippingService){
        this.shippingService = shippingService;
    }
    @Override
    public void ship(String Product, String Address) {
        shippingService.ship(Product,Address);
    }

}
