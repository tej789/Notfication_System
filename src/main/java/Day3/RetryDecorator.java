package Day3;

public class RetryDecorator extends ShippingDecorator{

    public RetryDecorator(ShippingService shippingService) {
        super(shippingService);
    }

        @Override
        public void ship(String product,String address){

        for(int i= 0;i<3;i++){
            try {
                shippingService.ship(product, address);
                return;
            }
            catch(Exception e){
                System.out.println("Failed");
            }
        }
        System.out.println("Shipping Failed");
    }
}
