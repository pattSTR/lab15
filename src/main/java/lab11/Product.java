package lab11;

public class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void sell() {
        System.out.println("Продаю товар '" + name + "' по стандартной цене " + price + " BYN.");
    }

    public void sell(int quantity) {
        double total = price * quantity;
        System.out.printf("Продаю %d шт. товара '%s'. Общая стоимость: %.2f BYN.%n", quantity, name, total);
    }

    public void sell(double discount) {
        double discountedPrice = price * (1 - discount / 100.0);
        System.out.printf("Продаю товар '%s' со скидкой %.1f%%. Итоговая цена: %.2f BYN.%n",
                name, discount, discountedPrice);
    }

    public double getDiscount() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.printf("Товар: %-15s | Цена: %7.2f BYN | Вес: %.2f кг | Базовая скидка: %.1f%%%n",
                name, price, weight, getDiscount());
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getWeight() { return weight; }
}