package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class StringProcessor, method isAnagram")
public class IsAnagramTest extends StringProcessorTest {
    /**
     *  happy path
     *      "silent", "listen" -> true
     *      "A gentleman", "Elegant man" -> true
     *      "Eleven plus twu", "Twelve plus one" -> true
     *      "Debit card", "Bad credit" -> true
     *      "12345", "54321" -> true
     *      "!@#$%", "%$#@!" -> true
     *  negative cases:
     *      "java", "python" -> false
     *      "apple", "pale" -> false
     *      "cat", "rat" -> false
     *  strings with null:
     *      null, "world" -> false
     *      "hello", null -> false
     *      null, null -> false
     */
    @ParameterizedTest
    @CsvSource({
            "silent, listen",
            "A gentleman, Elegant man",
            "Eleven plus two, Twelve plus one",
            "Debit card, Bad credit",
            "12345, 54321",
            "!@#$%, %$#@!"
    })
    public void userCanCheckIsAnagram(String str1, String str2) {
        assertTrue(stringProcessor.isAnagram(str1, str2));
    }

    @ParameterizedTest
    @CsvSource({
            "java, python",
            "apple, pale",
            "cat, rat"
    })
    public void userCanCheckIsNotAnagram(String str1, String str2) {
        assertFalse(stringProcessor.isAnagram(str1, str2));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "null, world",
            "hello, null",
            "null, null"
    }, nullValues = "null")
    public void userGetsFalseIfStringIsNull(String str1, String str2) {
        assertFalse(stringProcessor.isAnagram(str1, str2));
    }
}
