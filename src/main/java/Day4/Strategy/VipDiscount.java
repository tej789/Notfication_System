package Day4.Strategy;

public class VipDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double amount) {

        return amount * 0.15;
    }
}