package lab11;

public class Food extends Product {
    private int expirationDays;

    public Food(String name, double price, double weight, int expirationDays) {
        super(name, price, weight);
        this.expirationDays = expirationDays;
    }

    @Override
    public double getDiscount() {
        return 15.0;
    }

    public int getExpirationDays() {
        return expirationDays;
    }
}