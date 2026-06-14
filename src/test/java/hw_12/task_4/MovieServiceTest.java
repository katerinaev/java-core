package hw_12.task_4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    @Test
    void testAddIntegerRating() {
        MovieService<Integer> serviceInt = new MovieService<>();
        Movie matrix = new Movie("Matrix");

        serviceInt.addRating(matrix, new Rating<>(9));
        assertEquals(9, serviceInt.getAverageRating(matrix));
    }

    @Test
    void testAddDoubleRating() {
        MovieService<Double> serviceDouble = new MovieService<>();
        Movie matrix = new Movie("Matrix");

        serviceDouble.addRating(matrix, new Rating<>(8.5));
        assertEquals(8.5, serviceDouble.getAverageRating(matrix));
    }

    @Test
    void testAddRatingLessThanOne() {
        MovieService<Double> service = new MovieService<>();
        Movie interstellar = new Movie("Interstellar");
        assertThrows(IllegalArgumentException.class, () ->
                service.addRating(interstellar, new Rating<>(0.1)));

    }

    @Test
    void testAddRatingGreaterThanTen() {
        MovieService<Integer> service = new MovieService<>();
        Movie interstellar = new Movie("Interstellar");
        assertThrows(IllegalArgumentException.class, () ->
                service.addRating(interstellar, new Rating<>(11)));

    }

    @Test
    void testGetAverageRating() {
        MovieService<Integer> service = new MovieService<>();
        Movie matrix = new Movie("Matrix");
        service.addRating(matrix, new Rating<>(1));
        service.addRating(matrix, new Rating<>(10));

        assertEquals(5.5, service.getAverageRating(matrix));
    }

    @Test
    void testAverageRatingWithoutRating() {
        MovieService<Integer> service = new MovieService<>();
        Movie warrior = new Movie("Peaceful warrior");

        assertThrows(IllegalArgumentException.class, () -> service.getAverageRating(warrior));
    }

    @Test
    void testGetMoviesSortedByRating() {
        MovieService<Integer> service = new MovieService<>();
        Movie warrior = new Movie("Peaceful warrior");
        Movie matrix = new Movie("Matrix");
        Movie interstellar = new Movie("Interstellar");

        service.addRating(warrior, new Rating<>(6));
        service.addRating(warrior, new Rating<>(10));
        service.addRating(matrix, new Rating<>(9));
        service.addRating(interstellar, new Rating<>(7));

        List<Movie> sorted = service.getMoviesSortedByRating();

        assertEquals(matrix, sorted.get(0));
        assertEquals(warrior, sorted.get(1));
        assertEquals(interstellar, sorted.get(2));
    }
}
