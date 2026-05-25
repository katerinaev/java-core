package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class NumberProcessor, method isEven")
public class IsEvenTest extends NumberProcessorTest {
    /**
     * Tests for check ii a number is even
     * happy path
     *  positive number: 8 -> true
     *  negative number: -10 -> true
     * negative cases
     *  positive number: 7 -> false
     *  negative number: -11 -> false
     * corner case
     *  0 -> true
     */
    @ParameterizedTest
    @ValueSource(ints = {8, -10, 0})
    public void userCanCheckIfNumberIsEven(int number) {
        boolean isEven = numberProcessor.isEven(number);

        assertTrue(isEven);
    }

    @ParameterizedTest
    @ValueSource(ints = {7, -11})
    public void userCanCheckIfNumberIsNotEven(int number) {
        boolean isEven = numberProcessor.isEven(number);

        assertFalse(isEven);
    }
}
