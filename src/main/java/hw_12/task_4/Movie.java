package hw_12.task_4;

import java.util.Objects;

/*
Task 4: Movie Rating
Description:
Develop a system that allows users to rate and manage movies. The system should support
various rating types, such as integers or fractional values, and provide functionality
for calculating the average movie rating and sorting movies by popularity.

Functional Requirements:
Classes and Interfaces:
Movie: A class representing a movie with fields for the title and other characteristics.
Rating<T extends Number>: A class for storing a movie rating. T can be Integer, Double, etc.
MovieService: A service for managing movies and their ratings.

Rating Management:
Storing ratings in a Map<Movie, List<Rating>>.
A method for adding a rating to a movie. The method should be thread-safe and validate
the rating (e.g., the rating must be between 1 and 10).
Calculating an average rating for each movie.

Data Processing:
Using the Stream API to calculate the average rating.
Using the Stream API and lambda expressions to sort movies by average rating.
*/
public class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
