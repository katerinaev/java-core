package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class StringProcessor, method countWords")
public class CountWordsTest extends StringProcessorTest {
    /**
     * Test to count words in sentence
     * happy path:
     *  regular sentence: "I love Java" -> 3
     *  with many spaces between words: "I   don't     like   Python" -> 4
     *  with spaces at the beginning: "   Java" -> 1
     *  with spaces at the end: "Java  " -> 1
     * corner cases:
     *  empty string: "" -> 0
     *  string with spaces: "     " -> 0
     *  string with special characters: "\t \n" -> 0
     *  null -> IllegalArgumentException
     */
    @ParameterizedTest
    @CsvSource({
            "'I love Java', 3",
            "'I   don''t     like   Python', 4",
            "'   Java', 1",
            "'Java  ', 1",
            "'', 0",
            "'         ', 0",
            "'\t \n', 0"
    })
    public void userCanCountWordsInValidString(String sentence, int expectedCount) {
        int actualCount = stringProcessor.countWords(sentence);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void userCannotCountWordsInNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.countWords(null);
        }, "String must not b null");
    }
}
