package Day3;

public class NewShippingService implements ShippingService{


    @Override
    public void ship(String Product, String Address) {
        System.out.println("Shipping "+Product+" At Location "+Address);

//        System.out.println("Shipping failed!");
//        throw new RuntimeException("Shipping error");
    }
}
