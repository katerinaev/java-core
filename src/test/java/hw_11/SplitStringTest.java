package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("class StringProcessor, method splitString")
public class SplitStringTest extends StringProcessorTest {
    /**
     * Tests to check string splitting
     * happy path
     *  "I love Java", " " -> {"I", "live", "Java"}
     * corner cases:
     *  - jne word string "Java", "," -> {"Java"}
     *  - empty string "", "," -> {""}
     */
    @Test
    public void userCanSplitString() {
        String input = "I love Java";
        String[] expected = {"I", "love", "Java"};

        assertArrayEquals(expected, stringProcessor.splitString(input, " "));
    }

    @Test
    public void userCanSplitStringFromOneWord() {
        String input = "Java";
        String[] expected = {"Java"};

        assertArrayEquals(expected, stringProcessor.splitString(input, ","));
    }

    @Test
    public void userGetsEmptyArrayIfSplitEmptyString() {
        String input = "";
        String[] expected = {""};

        assertArrayEquals(expected, stringProcessor.splitString(input, ","));
    }
}
