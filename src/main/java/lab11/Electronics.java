package lab11;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, double weight, int warrantyMonths) {
        super(name, price, weight);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscount() {
        return 5.0;
    }
    public void sell(int quantity, boolean withWarranty) {
        sell(quantity);
        if (withWarranty) {
            System.out.println("   -> Оформлена дополнительная гарантия на " + warrantyMonths + " мес.");
        }
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}