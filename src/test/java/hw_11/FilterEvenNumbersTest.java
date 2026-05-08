package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class NumberProcessor, method filterEvenNumbers")
public class FilterEvenNumbersTest extends NumberProcessorTest {
    /**
     * happy path
     *  list with mixed numbers: [-6, 4, 3, -2, -5, 1] -> [-6, 4, -2]
     * negative test
     *  list with odd numbers: [3, 1, -7, -5] -> []
     * corner case
     *  empty list: [] -> []
     */

    @Test
    public void userCanFilterEvenNumbersInMixedList() {
        List<Integer> numbers = Arrays.asList(-6, 4, 3, -2, -5, 1);
        List<Integer> evenNumbers = Arrays.asList(-6, 4, -2);

        assertEquals(evenNumbers, numberProcessor.filterEvenNumbers(numbers));
    }

    @Test
    public void userGetEmptyListIfFilerListOfOddNumbers() {
        List<Integer> numbers = Arrays.asList(3, 1, -7, -5);

        assertTrue(numberProcessor.filterEvenNumbers(numbers).isEmpty());
    }

    @Test
    public void userGetEmptyListIfFilerEmptyList() {
        List<Integer> numbers = List.of();

        assertTrue(numberProcessor.filterEvenNumbers(numbers).isEmpty());
    }
}
