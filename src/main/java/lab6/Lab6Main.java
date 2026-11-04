package lab6;

public class Lab6Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №6 (Вариант 7) ===");

        Apartment myApartment = new Apartment("пр-т Независимости, д. 15, кв. 42", 2, 54.0);

        System.out.println("Адрес: " + myApartment.getAddress());
        System.out.println("Количество комнат: " + myApartment.getRooms());
        System.out.println("Площадь: " + myApartment.getArea() + " кв. м.");

        double totalPrice = 58000.0;
        System.out.println("Общая стоимость квартиры: " + totalPrice + " $");

        double pricePerMeter = myApartment.pricePerSquareMeter(totalPrice);
        System.out.printf("Цена за квадратный метр: %.2f $/кв.м.%n", pricePerMeter);

        System.out.println("\nМеняем площадь квартиры через сеттер...");
        myApartment.setArea(60.0);
        System.out.println("Новая площадь: " + myApartment.getArea() + " кв. м.");
        System.out.printf("Новая цена за квадратный метр: %.2f $/кв.м.%n",
                myApartment.pricePerSquareMeter(totalPrice));
    }
}