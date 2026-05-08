package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class NumberProcessor, method factorial")
public class FactorialTest extends NumberProcessorTest {
    /** Tests fo find factorial
     * happy path
     *  1! -> 1
     *  5! -> 120
     *  7! -> 5040
     * corner case
     *  0! -> 1
     *  -5! -> IllegalArgumentException
     *  -7! -> IllegalArgumentException
     *  -1! -> IllegalArgumentException
     */
    public static Stream<Arguments> validNumbersForFactorial() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040),
                Arguments.of(0, 1)
        );
    }
    @ParameterizedTest
    @MethodSource("validNumbersForFactorial")
    public void userCanGetFactorialFromPositiveNumberAndZero(int number, int expectedFactorial) {
        int actualResult = numberProcessor.factorial(number);

        assertEquals(expectedFactorial, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-7, -5, -1})
    public void userCannotGetFactorialFromNegativeNumber(int number) {
        assertThrows(IllegalArgumentException.class, () -> {
            numberProcessor.factorial(number);
        }, "Attempt to fet factorial from negative number lead to IllegalArgumentException");
    }
}
