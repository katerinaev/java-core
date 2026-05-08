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

@DisplayName("class NumberProcessor, method findSecondMax")
public class FindSecondMaxTest extends NumberProcessorTest {
    /**
     * happy path
     *  - array of positive numbers: {20, 1, 3, 10, 8, 5} -> 10
     *  - array of negative numbers: {-11, -33, -5, -8, -10, -20} -> -8
     * corner case
     *  - array of 2 numbers: {88, -15} -> -15
     * negative cases
     *  - array of the same number: {8, 8, 8, 8, 8} -> NoSuchElementException
     *  - array of one number: {5} -> IllegalArgumentException
     *  - empty array {} -> illegalArgumentException
     */
    public static Stream<Arguments> arrayToFindSecondMax() {
        return Stream.of(
                Arguments.of(new int[]{20, 1, 3, 10, 8, 5}, 10),
                Arguments.of(new int[]{-11, -33, -5, -8, -10, -20}, -8),
                Arguments.of(new int[] {88, -15}, -15)
        );
    }

    @ParameterizedTest
    @MethodSource("arrayToFindSecondMax")
    public void userCanFindSecondMaxInArray(int[] array, int expectedMax) {
        int actualMax = numberProcessor.findSecondMax(array);

        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void userCannotFindSecondMaxInArrayOfSameElement() {
        assertThrows(NoSuchElementException.class, () -> {
            numberProcessor.findSecondMax(new int[]{8, 8, 8, 8, 8});
        }, "Same numbers in array!");
    }

    @Test
    public void userCannotFindSecondMaxInArrayOfOneElement() {
        assertThrows(IllegalArgumentException.class, () -> {
            numberProcessor.findSecondMax(new int[]{8});
        }, "One numbers in array!");
    }

    @Test
    public void userCannotFindSecondMaxInEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            numberProcessor.findSecondMax(new int[]{});
        }, "Empty array!");
    }
}
