package lab13;

import java.util.List;

public class Film {
    private String title;
    private String director;
    private int year;
    private double rating;
    private String genre;
    
    public Film(String title, String director, int year, double rating, String genre)
            throws InvalidFilmDataException, RatingUpdateException {
        setTitle(title);
        setDirector(director);
        setGenre(genre);
        setYear(year);
        setRating(rating);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) throws InvalidFilmDataException {
        if (year < 1900 || year > 2025) {
            throw new InvalidFilmDataException("Неверный год: " + year);
        }
        this.year = year;
    }

    public void setRating(double rating) throws RatingUpdateException {
        if (rating < 1 || rating > 10) {
            throw new RatingUpdateException("Неверный рейтинг: " + rating);
        }
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public int getYear() { return year; }
    public double getRating() { return rating; }

    public static Film getFilmByYear(List<Film> films, int year) throws FilmNotFoundException {
        for (Film f : films) {
            if (f.getYear() == year) {
                return f;
            }
        }
        throw new FilmNotFoundException("Фильм с годом " + year + " не найден");
    }
}