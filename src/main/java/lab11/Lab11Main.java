package lab11;

public class Lab11Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №11 (Вариант 7: Продукты) ===\n");

        System.out.println("--- 1. Динамический полиморфизм (Массив Product[]) ---");
        Product[] catalog = new Product[4];
        catalog[0] = new Product("Канцелярия", 10.0, 0.2);
        catalog[1] = new Electronics("Телевизор", 1500.0, 12.0, 24);
        catalog[2] = new Food("Торт 'Сказка'", 25.0, 1.2, 5);
        catalog[3] = new Electronics("Смартфон", 900.0, 0.3, 12);

        for (Product p : catalog) {
            p.displayInfo();
        }

        System.out.println("\n--- 2. Статический полиморфизм (Перегрузка метода sell) ---");
        Product sampleProduct = catalog[1];

        System.out.println("Вызов sell() без аргументов:");
        sampleProduct.sell();

        System.out.println("\nВызов sell(int quantity):");
        sampleProduct.sell(3);

        System.out.println("\nВызов sell(double discount) со скидкой категории:");
        sampleProduct.sell(sampleProduct.getDiscount());

        System.out.println("\n--- 3. Уникальная перегрузка в Electronics ---");
        if (sampleProduct instanceof Electronics) {
            Electronics tv = (Electronics) sampleProduct;
            tv.sell(2, true);
        }
    }
}