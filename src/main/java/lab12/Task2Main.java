package lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Task2Main {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1, "Италия", "Итальянская", 3, Arrays.asList(5, 4, 5)));
        restaurants.add(new Restaurant(2, "Токио", "Японская", 2, Arrays.asList(1, 2, 3)));
        restaurants.add(new Restaurant(3, "Берлин", "Немецкая", 4, Arrays.asList(4, 5, 4)));
        restaurants.add(new Restaurant(4, "Париж", "Французская", 1, Arrays.asList(2, 1, 2)));
        restaurants.add(new Restaurant(5, "Альфа", "Русская", 3, Arrays.asList(3, 4, 4)));
        restaurants.add(new Restaurant(6, "Бета", "Азиатская", 5, Arrays.asList(5, 5, 5)));
        restaurants.add(new Restaurant(7, "Альфа-2", "Русская", 4, Arrays.asList(5, 5, 5)));

        System.out.println("--- 1. Удаление ресторанов со средним рейтингом < 3 ---");
        Iterator<Restaurant> iterator = restaurants.iterator();
        while (iterator.hasNext()) {
            Restaurant r = iterator.next();
            if (r.getAverageReview() < 3) {
                System.out.println("Удален: " + r.getName());
                iterator.remove();
            }
        }

        System.out.println("\n--- 2. Повышение звездности при рейтинге >= 4 ---");
        for (Restaurant r : restaurants) {
            if (r.getAverageReview() >= 4) {
                r.setStars(r.getStars() + 1);
                System.out.println(r.getName() + " повышен до " + r.getStars() + " звезд");
            }
        }

        System.out.println("\n--- 3. Печать ресторанов с 4 звездами ---");
        printRestaurants(restaurants, 4);

        System.out.println("\n--- 4. Сортировка (по убыванию рейтинга, потом по имени) ---");

        restaurants.sort(new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant r1, Restaurant r2) {
                int cmp = Double.compare(r2.getAverageReview(), r1.getAverageReview());
                if (cmp == 0) {
                    return r2.getName().compareTo(r1.getName());
                }
                return cmp;
            }
        });

        for (Restaurant r : restaurants) {
            System.out.println("ID: " + r.getId() + ", Название: " + r.getName() + ", Средний рейтинг: " + r.getAverageReview());
        }
    }

    public static void printRestaurants(List<Restaurant> restaurants, int stars) {
        for (Restaurant r : restaurants) {
            if (r.getStars() == stars) {
                System.out.println(r.getName() + " - " + r.getStars() + " звезд(ы)");
            }
        }
    }
}