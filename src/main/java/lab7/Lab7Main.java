package lab7;

public class Lab7Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №7 (Вариант 7) ===");

        // Создаем 5 объектов смартфонов по заданию
        Smartphone phone1 = new Smartphone("iPhone 15", 128, 48);
        Smartphone phone2 = new Smartphone("Samsung Galaxy S23", 256, 50);
        Smartphone phone3 = new Smartphone("Xiaomi 13T", 256, 50);
        Smartphone phone4 = new Smartphone("Google Pixel 8", 128, 50);
        Smartphone phone5 = new Smartphone("OnePlus 12", 512, 64);

        // Выводим список созданных смартфонов
        System.out.println("\nСписок добавленных смартфонов:");
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();
        phone4.printInfo();
        phone5.printInfo();

        System.out.println("----------------------------------------------");

        // Вызов статических методов и вывод общей статистики
        // Обрати внимание: к статическому методу обращаемся через ИМЯ КЛАССА (Smartphone.)
        System.out.println("Всего смартфонов создано: " + Smartphone.getTotalPhones());
        System.out.println("Общий объем памяти всех устройств: " + Smartphone.getTotalMemory() + " ГБ");

        // Вызываем требуемый статический метод getAverageMemory()
        double avgMemory = Smartphone.getAverageMemory();
        System.out.printf("Средний объем памяти смартфонов: %.2f ГБ%n", avgMemory);
    }
}