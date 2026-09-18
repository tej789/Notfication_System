package Day4.Strategy;

public class RegularDiscount implements  DiscountStrategy{


    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}
