package Day4.Strategy;

public class DiscountFactory {

    public static DiscountStrategy getDiscount(String customerType){

        switch(customerType.toUpperCase()){
            case "REGULAR":
                return new RegularDiscount();

            case "MEMBER":
                return new MemberDiscount();

            case "VIP":
                return new VipDiscount();

            default:
                throw new IllegalArgumentException(
                        "Invalid Customer Type"
                );
        }
    }
}
