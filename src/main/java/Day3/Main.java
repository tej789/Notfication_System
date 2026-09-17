package Day3;

public class Main {
    public static void main(String[] args) {
        ThirdPartyShipping thirdPartyShipping=new ThirdPartyShipping();

        ShippingAdapter shippingAdapter = new ShippingAdapter(thirdPartyShipping);

        shippingAdapter.ship("Laptop","Vadodara");

        ShippingService service = new NewShippingService();

        service = new RetryDecorator(service);

        service = new LoggingDecorator(service);
        service.ship("Laptop","Vadodara");
    }
}

//BufferedReader wrapping FileReader is an example of the Decorator pattern because
// BufferedReader adds buffering functionality without changing FileReader.
// Another common example is DataInputStream wrapping an InputStream, where it adds
// methods for reading primitive data types.