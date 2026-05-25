package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class StringProcessor, method countVowels")
public class CountVowelsTest extends StringProcessorTest {
    /**
     * happy path
     * "hello" -> 2
     * "java" -> 2
     * "AEIOU" -> 5
     * corner cases
     * "" -> 0
     * "bcdfg" -> 0
     * "            " -> 0
     * "a" -> 1
     * "b" -> 0
     * null -> IllegalArgumentException
     */
    public static Stream<Arguments> validStringsToCountVowels() {
        return  Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("bcdfg", 0),
                Arguments.of("     ", 0),
                Arguments.of("a", 1),
                Arguments.of("b", 0));
    }
    @ParameterizedTest
    @MethodSource("validStringsToCountVowels")
    public void userCanCountVowelsInString(String input, int expectedVowelsCount) {
        int countVowels = stringProcessor.countVowels(input);
        assertEquals(expectedVowelsCount, countVowels);
    }

    @Test
    public void userCannotCountVowelsInNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.countVowels(null);
        }, "Count of vowels in null string should lead to IllegalArgumentException");
    }
}
