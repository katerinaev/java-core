package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class NumberProcessor, method findMax")
public class FindMaxTest extends NumberProcessorTest {
    /**
     * Tests for find max in array
     * happy path
     *  array with positive numbers {3, 5, 7, 2} -> 7
     *  array with negative numbers {-103, -55, -57, -222} -> -55
     * corner case
     *  array from 1 element {55} -> 55
     * negative cases
     * empty array {} -> NoSuchElementException
     * null -> IllegalArgumentException
     */

    public static Stream<Arguments> arrayForFindMax() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{-103, -55, -57, -222}, -55),
                Arguments.of(new int[]{55}, 55));
    }

    @ParameterizedTest
    @MethodSource("arrayForFindMax")
    public void userCanFindMaxElementInArray(int[] array, int expectedMax) {
        int actualMax = numberProcessor.findMax(array);

        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void userCannotFindMaxInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {
            numberProcessor.findMax(new int[] {});
        }, "Array cannot be empty");
    }

    @Test
    public void userCannotFindMaxInNullArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            numberProcessor.findMax(null);
        }, "Null leads to IllegalArgumentException");
    }
}
