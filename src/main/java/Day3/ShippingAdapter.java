package Day3;

public class ShippingAdapter implements ShippingService{

    private ThirdPartyShipping thirdPartyShipping;

    public ShippingAdapter(ThirdPartyShipping thirdPartyShipping){
        this.thirdPartyShipping = thirdPartyShipping;
    }

    @Override
    public void ship(String Product, String Address) {
thirdPartyShipping.shipPackage(Product,Address);
    }
}
