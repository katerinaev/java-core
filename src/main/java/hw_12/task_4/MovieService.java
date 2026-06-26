package hw_12.task_4;

import java.util.*;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> ratings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        double ratingValue = rating.getValue().doubleValue();

        if (ratingValue < 1.0 || ratingValue > 10.0) {
            throw new IllegalArgumentException("Rating must be from 1 to 10");
        }

        ratings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public synchronized double getAverageRating(Movie movie) {
        List<Rating<T>> movieRatings = ratings.get(movie);

        if (movieRatings == null || movieRatings.isEmpty()) {
            throw new IllegalArgumentException("No ratings for film");
        }
        return movieRatings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("No rating"));
    }

    public synchronized List<Movie> getMoviesSortedByRating() {
        return ratings.keySet()
                .stream()
                .sorted(Comparator.comparingDouble(this::getAverageRating)
                        .reversed())
                .toList();

    }
}
