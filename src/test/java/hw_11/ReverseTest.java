package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("class StringProcessor, method reverse")
public class ReverseTest extends StringProcessorTest {
    /**
     * Tests for string reverse:
     *  happy path: "hello" → "olleh"
     *              "Java" → "avaJ"
     *              "12345" → "54321"
     *  corner cases:
     *          "" → ""
     *          "a" → "a"
     *          null → null
     */
    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                // happy path: "hello" → "olleh"
                Arguments.of("hello", "olleh"),
                // happy path: "Java" → "avaJ"
                Arguments.of("Java", "avaJ"),
                // happy path: "12345" → "54321"
                Arguments.of("12345", "54321"),
                // corner cases: "" → ""
                Arguments.of("", ""),
                // corner cases: "a" → "a"
                Arguments.of("a", "a"));
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString,
                "String reversed incorrectly");
    }

    @Test
    public void userCanGetNullWhileReverseNullString() {
        assertNull(stringProcessor.reverse(null));
    }
}
