package lab12;

import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private String cuisine;
    private int stars;
    private List<Integer> customerReviews;

    public Restaurant(int id, String name, String cuisine, int stars, List<Integer> customerReviews) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
        this.stars = stars;
        this.customerReviews = customerReviews;
    }

    public double getAverageReview() {
        if (customerReviews.isEmpty()) return 0;
        int sum = 0;
        for (int review : customerReviews) {
            sum += review;
        }
        return (double) sum / customerReviews.size();
    }

    public int getStars() { return stars; }
    public void setStars(int stars) { this.stars = stars; }
    public String getName() { return name; }
    public int getId() { return id; }
}