package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class NumberProcessor, method isLeapYear")
public class IsLeapYearTest extends NumberProcessorTest {
    /** Leap Year tests
     *  year % 4 == 0 & year % 100 != 0: 1988, 2020 -> true
     *  year % 400: 2000, 1600 -> true
     *
     * corner cases
     *  0, 4, 400 -> true
     * negative cases
     *  non leap year 2015, 2018, 2022 -> false
     *  year % 100 == 0 && year % 400 != 0 : 1900, 2100 ->false
     */

    @ParameterizedTest
    @ValueSource(ints = {
            1988, 2020,
            2000, 1600,
            0, 4, 400
    })
    public void userCheckIfYearIsLeap(int year) {
        boolean actualResult = numberProcessor.isLeapYear(year);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            2015, 2018, 2022,
            1900, 2100
    })
    public void userCheckIfYearIsNotLeap(int year) {
        boolean actualResult = numberProcessor.isLeapYear(year);
        assertFalse(actualResult);
    }
}
