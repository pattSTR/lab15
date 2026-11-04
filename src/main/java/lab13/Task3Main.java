package lab13;

import java.util.ArrayList;
import java.util.List;

public class Task3Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();

        try {
            Film goodFilm = new Film("Интерстеллар", "Нолан", 2014, 9.5, "Фантастика");
            films.add(goodFilm);
            System.out.println("Фильм '" + goodFilm.getTitle() + "' успешно добавлен.");
        } catch (InvalidFilmDataException | RatingUpdateException e) {
            System.err.println("Ошибка при создании: " + e.getMessage());
        }

        try {
            Film badFilm1 = new Film("Бэтмен", "Снайдер", 1800, 5.0, "Экшн");
            films.add(badFilm1);
        } catch (InvalidFilmDataException | RatingUpdateException e) {
            System.err.println("Ошибка при создании: " + e.getMessage());
        }

        try {
            Film badFilm2 = new Film("Бэтмен 2", "Снайдер", 2022, 11.0, "Экшн");
            films.add(badFilm2);
        } catch (InvalidFilmDataException | RatingUpdateException e) {
            System.err.println("Ошибка при создании: " + e.getMessage());
        }

        System.out.println("\nВсего фильмов в базе: " + films.size());

        System.out.println("\n--- Обновление рейтинга ---");
        try {
            films.get(0).setRating(9.9);
            System.out.println("Рейтинг обновлен: " + films.get(0).getTitle() + " -> " + films.get(0).getRating());

            films.get(0).setRating(15.0);
        } catch (RatingUpdateException e) {
            System.err.println("Ошибка обновления: " + e.getMessage());
        }

        System.out.println("\n--- Поиск фильма по году ---");
        try {
            Film found = Film.getFilmByYear(films, 2014);
            System.out.println("Найден фильм: " + found.getTitle());

            Film.getFilmByYear(films, 1999);
        } catch (FilmNotFoundException e) {
            System.err.println("Ошибка поиска: " + e.getMessage());
        }
    }
}